angular.module('sfxApp')
    // clock widget
    // TODO move as a seperate plugin
    .directive('widgetClock', function () {
        var defaults = {
                    showSecs: true,
                    showAmPm: true,
                    gmtOffset: false,
                    showDigital: false,
                    dualClock: false,
                };

        var lpad = function (num) {
                return (num < 10 ? '0' : '') + num;
            },
            // Checkfor offset and get correct time
            getDate = function (o) {
                var now = new Date();
                if (o.gmtOffset != null && o.gmtOffset !== false) {
                    // Use GMT + gmtOffset
                    var offsetNow = new Date(now.valueOf() + (o.gmtOffset * 1000 * 60 * 60));
                    return {
                        hrs: offsetNow.getUTCHours(),
                        mins: offsetNow.getUTCMinutes(),
                        secs: offsetNow.getUTCSeconds()
                    };
                } else {
                    // Use local time
                    return {
                        hrs: now.getHours(),
                        mins: now.getMinutes(),
                        secs: now.getSeconds()
                    };
                }
            },

            timeText = function (d, o) {
                return '' +
                    (o.showAmPm ? ((d.hrs % 12) == 0 ? 12 : (d.hrs % 12)) : d.hrs) + ':' +
                    lpad(d.mins) +
                    (o.showSecs ? ':' + lpad(d.secs) : '') +
                    (o.showAmPm ? (d.hrs < 12 ? ' AM' : ' PM') : '');
            };

        return {
            restrict: "AE",
            templateUrl: 'scripts/components/widget/widget.clock.partial.html',
            link: function (scope, element, attrs) {

                
            },
            scope: {},
            controller: ['$scope', '$element', '$attrs', '$timeout', function ($scope, $element, $attrs, $timeout) {
                var o = angular.copy(defaults);
                var gmtOffset=parseInt($element.data("gmt-offset"));
                o.gmtOffset = (gmtOffset!== undefined && gmtOffset!==null)? gmtOffset : false;
                $scope.date = getDate(o);
                $scope.digital = "Loading..";
                $scope.days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
                $scope.months = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];

                $scope.majors = new Array(12);
                $scope.minors = new Array(60);

                var tick = function () {
                    var date = getDate(o);
                    $scope.date = date;
                    $scope.digital = timeText(date,o);
                    $timeout(tick, 1000);
                };
                $timeout(tick, 1000);
        }]
        }
    });
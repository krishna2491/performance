angular.module('sfxApp')
    /*
     * WIDGET BOX
     * ------------
     * This is a custom directive for the Box widget. It provides a box view.
     */
    .directive('widgetBox', function () {
        return {
            restrict: "A"
        }
    })
    .directive('widgetBoxTools', function ($window, $timeout) {

        //Box Widget plugin options
        var options = {
                boxWidgetIcons: {
                    //The icon for collapse event
                    collapse: 'fa-minus',
                    //The icon for the opening event
                    open: 'fa-plus',
                    //The icon for removing event
                    remove: 'fa-times',
                    //The icon for the expand/compress event
                    expand: 'fa-expand',
                    compress: 'fa-compress'
                },
                boxWidgetSelectors: {
                    //Remove button selector
                    remove: '[data-widget="remove"]',
                    //Collapse button selector
                    collapse: '[data-widget="toggle"]',
                    //expand buton selected
                    expand: '[data-widget="expand"]'
                }
            },

            collapse = function (element) {
                //Find the box parent
                var box = element.parents(".box").first();
                //Find the body and the footer
                var bf = box.find(".box-body, .box-footer");
                if (!box.hasClass("collapsed-box")) {
                    //Convert minus into plus
                    element.children("." + options.boxWidgetIcons.collapse).removeClass(options.boxWidgetIcons.collapse).addClass(options.boxWidgetIcons.open);
                    bf.slideUp(300, function () {
                        box.addClass("collapsed-box");
                    });
                } else {
                    //Convert plus into minus
                    element.children("." + options.boxWidgetIcons.open).removeClass(options.boxWidgetIcons.open).addClass(options.boxWidgetIcons.collapse);
                    bf.slideDown(300, function () {
                        box.removeClass("collapsed-box");
                    });
                }
            },
            expand = function (element) {
                //Find the box parent
                var box = element.parents(".box").first();
                var height = window.innerHeight - 49;
                var body = $('body');
                var button = element.find('i');
                //if (!box.hasClass("expanded")) {

                button.toggleClass(options.boxWidgetIcons.expand).toggleClass(options.boxWidgetIcons.compress);
                box.toggleClass('expanded');
                box.toggleClass('expanded-padding');
                body.toggleClass('body-expanded');
                box.toggleClass('ui-state-disabled');

                var timeout = 500;
                var event = new Event('resize');
                $timeout(function () {
                    console.log("box resized");
                    $window.dispatchEvent(event);
                    event = null;
                }, timeout);

                /*if (body.hasClass('body-expanded')) {
                    timeout = 100;
                }*/
                /*setTimeout(function () {
                    box.toggleClass('expanded-padding');
                }, timeout);
                setTimeout(function () {
                    box.resize();
                    box.find('.angular-google-map').resize();
                }, timeout + 50);*/

                //}

            },
            remove = function (element) {
                //Find the box parent
                var box = element.parents(".box").first();
                box.slideUp();
            };
        return {
            restrict: "A",
            templateUrl: 'scripts/components/widget/widget.box.tools.partial.html',
            link: function (scope, element, attrs) {
                element.addClass("box-tools pull-right");
                /*element.find('[data-widget="toggle"]').click(function () {
                    $this = $(this);
                    $this.parents(".box-header").next().slideUp();
                });*/
                //Listen for collapse event triggers
                element.find(options.boxWidgetSelectors.collapse).click(function (e) {
                    e.preventDefault();
                    collapse($(this));
                });
                //Listen for remove event triggers
                element.find(options.boxWidgetSelectors.remove).click(function (e) {
                    e.preventDefault();
                    remove($(this));
                });
                //Listen for expand event triggers
                element.find(options.boxWidgetSelectors.expand).click(function (e) {
                    e.preventDefault();
                    expand($(this));
                });

            }
        }

    })
    .directive('widgetBoxTabs', function ($compile) {
        var toggleTab = function (element, container, attrs) {
            var tabPanes = $('.' + attrs.tabPane);
            var tlist = element.parent();//container.find('[data-tab-ref="' + element.data('tab-ref') + '"]').parent();
            //var list = element.parent();
            var pane = tabPanes.find('.' + element.data('tab-ref'));
            //container.
            tlist.siblings().removeClass("active");
            tlist.addClass("active");
            pane.siblings().removeClass("active");
            pane.addClass("active");
            container.find('.dropdown-toggle > .active-tab').html(element.html());

        };

        return {

            restrict: "A",
            link: function (scope, element, attrs) {
                var dropPlaceholder = element.find('.dropdown-placeholder');

                if (dropPlaceholder) {
                    //create a dropdown and insert into .dropdown-placeholder
                    var dropdownListDom = element.find('.nav-tabs');
                    var dropdownList = dropdownListDom.html();
                    var dropdown = '<div class="dropdown">' +
                        '<!--This dropdown will be shown in small form factors-->' +
                        '<a class="dropdown-toggle" widget-dropdown>' +
                        '<span class="active-tab">' + dropdownListDom.first().find('a').html() + '</span> <span class="caret"></span>' +
                        '</a>' +
                        '<ul class="dropdown-menu">' +
                        dropdownList +
                        '</ul>' +
                        '</div>';
                    dropPlaceholder.html($compile(dropdown)(scope));
                    //$dropdown(dropPlaceholder.find('.dropdown-toggle'));
                }
                //Listen for tab clicks
                element.find('a:not(.dropdown-toggle)').click(function (e) {
                    e.preventDefault();

                    toggleTab($(this), element, attrs);
                });
            }
        }
    })
    // simple dropdown widget (for simple html element dropdown)
    // just add attribute widget-dropdown to any element with .dropdown-toggle inside a .dropdown container, the next element of widget-panel with .dropdown-menu will be toggled by default
    .directive('widgetDropdown', function ($window, $timeout) {
        var bodyEl = angular.element($window.document.body);

        var show = function (parentEl, element) {
                // use timeout to hookup the events to prevent
                // event bubbling from being processed imediately.
                $timeout(function () {
                    bodyEl.on('click', function (e) {
                        onBodyClick(element, e)
                    });
                }, 0, false);
                parentEl.hasClass('dropdown') && parentEl.addClass('open');
            },

            hide = function (parentEl, element) {
                bodyEl.off('click', function (e) {
                    onBodyClick(element, e)
                });
                parentEl.hasClass('dropdown') && parentEl.removeClass('open');
            };
        // Private functions
        function onBodyClick(element, evt) {
            if (evt.target === element[0] || $(evt.target).parents('.dropdown-toggle')[0] === element[0]) return;
            return evt.target !== element[0] && $(evt.target).parents('.dropdown-toggle')[0] !== element[0] && hide(element.parent());
        };
        return {
            restrict: "A",
            link: function (scope, element, attrs) {

                element.bind('click', function (e) {
                    e.preventDefault();
                    var parentEl = element.parent();
                    if (parentEl.hasClass('dropdown') && parentEl.hasClass('open')) {
                        hide(parentEl, element);
                    } else {
                        show(parentEl, element);
                    }

                });


            }
        }
    })
    // simple dropdown panel widget (for simple html element panels)
    // just add attribute widget-panel to any element with .panel-toggle inside a .panel container, the next element of widget-panel with . panel-content will be toggled by default
    .directive('widgetPanel', function () {

        var show = function (parentEl, element) {
                parentEl.hasClass('panel') && parentEl.addClass('open');
            },

            hide = function (parentEl, element) {
                parentEl.hasClass('panel') && parentEl.removeClass('open');
            };

        return {
            restrict: "A",
            link: function (scope, element, attrs) {

                element.bind('click', function (e) {
                    e.preventDefault();
                    var parentEl = element.parent();
                    if (parentEl.hasClass('panel') && parentEl.hasClass('open')) {
                        hide(parentEl, element);
                    } else {
                        show(parentEl, element);
                    }

                });


            }
        }
    })
    
(window.webpackJsonp=window.webpackJsonp||[]).push([[13],{68:function(e,t,a){"use strict";a.r(t),a.d(t,"frontMatter",(function(){return c})),a.d(t,"metadata",(function(){return o})),a.d(t,"rightToc",(function(){return i})),a.d(t,"default",(function(){return p}));var r=a(2),n=a(6),b=(a(0),a(89)),c={id:"doc1",title:"GoF Design Patterns",sidebar_label:"Introduction",hide_table_of_contents:!0,author:"Joel Marcey"},o={unversionedId:"doc1",id:"doc1",isDocsHomePage:!0,title:"GoF Design Patterns",description:"**",source:"@site/docs\\doc1.md",permalink:"/gof-design-patterns/docs/",sidebar_label:"Introduction",sidebar:"someSidebar",next:{title:"Singleton Pattern",permalink:"/gof-design-patterns/docs/doc2"}},i=[{value:"Table of contents",id:"table-of-contents",children:[]},{value:"What is a design pattern?",id:"what-is-a-design-pattern",children:[]},{value:"Why you should learn design patterns?",id:"why-you-should-learn-design-patterns",children:[]},{value:"How to approach?",id:"how-to-approach",children:[]}],l={rightToc:i};function p(e){var t=e.components,a=Object(n.a)(e,["components"]);return Object(b.b)("wrapper",Object(r.a)({},l,a,{components:t,mdxType:"MDXLayout"}),Object(b.b)("hr",null),Object(b.b)("pre",null,Object(b.b)("code",Object(r.a)({parentName:"pre"},{}),'This repository contains examples of all the design patterns listed in the \n"Design patterns - Elements of Reusable Object-oriented Software" book \nby Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides \npopularly known as Gang of Four (GoF). \n')),Object(b.b)("hr",null),Object(b.b)("h2",{id:"table-of-contents"},"Table of contents"),Object(b.b)("ul",null,Object(b.b)("li",{parentName:"ul"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#what-is-a-design-pattern"}),"What is a design pattern")),Object(b.b)("li",{parentName:"ul"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#why-you-should-learn-design-patterns"}),"Why you should learn design patterns")),Object(b.b)("li",{parentName:"ul"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#how-to-approach"}),"How to approach")),Object(b.b)("li",{parentName:"ul"},"Creational design patterns (5)",Object(b.b)("ol",{parentName:"li"},Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#1-singleton-pattern-gem"}),"Singleton")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#2-builder-pattern-construction_worker"}),"Builder")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#3-prototype-pattern-clipboard"}),"Prototype")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#4-factory-method-pattern-factory"}),"Factory Method")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#5-abstractfactory-pattern-factory--factory"}),"Abstract Factory")))),Object(b.b)("li",{parentName:"ul"},"Structural design patterns (7)",Object(b.b)("ol",{parentName:"li"},Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#1-adapter-pattern--electric_plug"}),"Adapter")," "),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#2-bridge-pattern--bridge_at_night"}),"Bridge")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#3-Composite-pattern--leaves"}),"Composite")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#4-decorator-pattern-heart_decoration"}),"Decorator")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#5-facade-pattern--notes"}),"Facade")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#6-flyweight-pattern-butterfly"}),"Flyweight")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#7-proxy-pattern-trollface"}),"Proxy")))),Object(b.b)("li",{parentName:"ul"},"Behavioral design patterns (11)",Object(b.b)("ol",{parentName:"li"},Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#1-chain-of-responsibility-chains"}),"Chain of Responsibility")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#2-command-pattern-genie"}),"Command")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#3-Interpreter-pattern-speaking_head"}),"Interpreter")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#4-Iterator-pattern-loop"}),"Iterator")),Object(b.b)("li",{parentName:"ol"},Object(b.b)("a",Object(r.a)({parentName:"li"},{href:"#5-mediator-pattern-phone"}),"Mediator")),Object(b.b)("li",{parentName:"ol"},"Memento"),Object(b.b)("li",{parentName:"ol"},"Observer"),Object(b.b)("li",{parentName:"ol"},"State"),Object(b.b)("li",{parentName:"ol"},"Strategy"),Object(b.b)("li",{parentName:"ol"},"Template method"),Object(b.b)("li",{parentName:"ol"},"Visitor")))),Object(b.b)("h2",{id:"what-is-a-design-pattern"},"What is a design pattern?"),Object(b.b)("p",null,"From Wiki:-"),Object(b.b)("ul",null,Object(b.b)("li",{parentName:"ul"},Object(b.b)("strong",{parentName:"li"},"A general reusable solution to a commonly occurring problem")," within a given context in software design.  "),Object(b.b)("li",{parentName:"ul"},"Not a finished design that can be transformed directly into source or machine code. "),Object(b.b)("li",{parentName:"ul"},"Rather, it is a ",Object(b.b)("strong",{parentName:"li"},"description or template for how to solve a problem")," that can be used in many different situations. "),Object(b.b)("li",{parentName:"ul"},"Design patterns are ",Object(b.b)("strong",{parentName:"li"},"formalized best practices")," that the programmer can use to solve common problems when designing an application or system.")),Object(b.b)("h2",{id:"why-you-should-learn-design-patterns"},"Why you should learn design patterns?"),Object(b.b)("ul",null,Object(b.b)("li",{parentName:"ul"},"Easy to communicate a proble among fellow developers"),Object(b.b)("li",{parentName:"ul"},"It provides a common vocabulary to explain about problem"),Object(b.b)("li",{parentName:"ul"},"It is an abstract topic"),Object(b.b)("li",{parentName:"ul"},"Revisit materails about patterns will alway give you an new perspective everytime.")),Object(b.b)("h2",{id:"how-to-approach"},"How to approach?"),Object(b.b)("p",null,"For each pattern you will see below points covered:"),Object(b.b)("ul",null,Object(b.b)("li",{parentName:"ul"},"Overview of the pattern"),Object(b.b)("li",{parentName:"ul"},"Concepts involved"),Object(b.b)("li",{parentName:"ul"},"Design considerations"),Object(b.b)("li",{parentName:"ul"},"Demo / Live example from an API / Steps to create"),Object(b.b)("li",{parentName:"ul"},"Drawbacks (Pitfalls)"),Object(b.b)("li",{parentName:"ul"},"Contrast to another patterns"),Object(b.b)("li",{parentName:"ul"},"Summary")),Object(b.b)("h1",{id:"creational-design-patterns-5"},"Creational design patterns (5)"),Object(b.b)("table",null,Object(b.b)("thead",{parentName:"table"},Object(b.b)("tr",{parentName:"thead"},Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:"right"}),"Sr. no"),Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:null}),"Pattern name"),Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:"center"}),"GoF book description"))),Object(b.b)("tbody",{parentName:"table"},Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"1"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#1-singleton-pattern-gem"}),"Singleton")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Ensure a class only has one instance, and provide a global point of access to it")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"2"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#2-builder-pattern-construction_worker"}),"Builder")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Saperate the construction of complex object from its representation so that the same construction process can create different representations"))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"3"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#3-prototype-pattern-clipboard"}),"Prototype")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"4"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#4-factory-method-pattern-factory"}),"Factory Method")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Define an interface for creating an object, but let sub-classess decide which class to instantiate. Factory method lets a class defer instantiation to subclasses"))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"5"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#5-abstractfactory-pattern-factory--factory"}),"Abstract Factory")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Provide an interface for creating families of related or dependent objects without specifying their concrete classes.")))),Object(b.b)("h1",{id:"structural-design-patterns-7"},"Structural design patterns (7)"),Object(b.b)("table",null,Object(b.b)("thead",{parentName:"table"},Object(b.b)("tr",{parentName:"thead"},Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:"right"}),"Sr. no"),Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:null}),"Pattern name"),Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:"center"}),"GoF book description"))),Object(b.b)("tbody",{parentName:"table"},Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"1"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#1-adapter-pattern--electric_plug"}),"Adapter")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"2"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#2-bridge-pattern--bridge_at_night"}),"Bridge")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Decouple an abstraction from its implementation so that the two can vary independently"))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"3"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#3-composite-pattern--leaves"}),"Composite")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"4"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#4-decorator-pattern-heart_decoration"}),"Decorator")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality."))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"5"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#5-facade-pattern--notes"}),"Facade")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"6"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#6-flyweight-pattern-butterfly"}),"Flyweight")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Use sharing to support large numbers of fine-grained objects efficiently."))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"7"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#7-proxy-pattern-trollface"}),"Proxy")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Provide a surrogate or placeholder for another object to control access to it.")))),Object(b.b)("h1",{id:"behavioral-design-patterns-11"},"Behavioral design patterns (11)"),Object(b.b)("table",null,Object(b.b)("thead",{parentName:"table"},Object(b.b)("tr",{parentName:"thead"},Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:"right"}),"Sr. no"),Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:null}),"Pattern name"),Object(b.b)("th",Object(r.a)({parentName:"tr"},{align:"center"}),"GoF book description"))),Object(b.b)("tbody",{parentName:"table"},Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"1"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#1-chain-of-responsibility-chains"}),"Chain of Responsibility")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"2"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#2-command-pattern-genie"}),"Command")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations."))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"3"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#3-Interpreter-pattern-speaking_head"}),"Interpreter")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"4"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#4-Iterator-pattern-loop"}),"Iterator")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation."))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"5"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),Object(b.b)("a",Object(r.a)({parentName:"td"},{href:"#5-mediator-pattern-phone"}),"Mediator")),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"6"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),"[Memento]"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Without violating encapsulation, capture and externali ze an object's internal state so that the object can be restored to this st ate later."))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"7"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),"[Observer]"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"8"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),"[State]"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Allow an object to alter its behavior when its internal state changes. The object will appear to change its class."))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"9"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),"[Strategy]"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.")),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"10"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),"[Template method]"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),Object(b.b)("strong",{parentName:"td"},"Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure."))),Object(b.b)("tr",{parentName:"tbody"},Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"right"}),"11"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:null}),"[Visitor]"),Object(b.b)("td",Object(r.a)({parentName:"tr"},{align:"center"}),"Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.")))))}p.isMDXComponent=!0},89:function(e,t,a){"use strict";a.d(t,"a",(function(){return s})),a.d(t,"b",(function(){return d}));var r=a(0),n=a.n(r);function b(e,t,a){return t in e?Object.defineProperty(e,t,{value:a,enumerable:!0,configurable:!0,writable:!0}):e[t]=a,e}function c(e,t){var a=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);t&&(r=r.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),a.push.apply(a,r)}return a}function o(e){for(var t=1;t<arguments.length;t++){var a=null!=arguments[t]?arguments[t]:{};t%2?c(Object(a),!0).forEach((function(t){b(e,t,a[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(a)):c(Object(a)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(a,t))}))}return e}function i(e,t){if(null==e)return{};var a,r,n=function(e,t){if(null==e)return{};var a,r,n={},b=Object.keys(e);for(r=0;r<b.length;r++)a=b[r],t.indexOf(a)>=0||(n[a]=e[a]);return n}(e,t);if(Object.getOwnPropertySymbols){var b=Object.getOwnPropertySymbols(e);for(r=0;r<b.length;r++)a=b[r],t.indexOf(a)>=0||Object.prototype.propertyIsEnumerable.call(e,a)&&(n[a]=e[a])}return n}var l=n.a.createContext({}),p=function(e){var t=n.a.useContext(l),a=t;return e&&(a="function"==typeof e?e(t):o(o({},t),e)),a},s=function(e){var t=p(e.components);return n.a.createElement(l.Provider,{value:t},e.children)},j={inlineCode:"code",wrapper:function(e){var t=e.children;return n.a.createElement(n.a.Fragment,{},t)}},O=n.a.forwardRef((function(e,t){var a=e.components,r=e.mdxType,b=e.originalType,c=e.parentName,l=i(e,["components","mdxType","originalType","parentName"]),s=p(a),O=r,d=s["".concat(c,".").concat(O)]||s[O]||j[O]||b;return a?n.a.createElement(d,o(o({ref:t},l),{},{components:a})):n.a.createElement(d,o({ref:t},l))}));function d(e,t){var a=arguments,r=t&&t.mdxType;if("string"==typeof e||r){var b=a.length,c=new Array(b);c[0]=O;var o={};for(var i in t)hasOwnProperty.call(t,i)&&(o[i]=t[i]);o.originalType=e,o.mdxType="string"==typeof e?e:r,c[1]=o;for(var l=2;l<b;l++)c[l]=a[l];return n.a.createElement.apply(null,c)}return n.a.createElement.apply(null,a)}O.displayName="MDXCreateElement"}}]);
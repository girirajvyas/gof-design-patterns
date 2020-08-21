(window.webpackJsonp=window.webpackJsonp||[]).push([[27],{80:function(e,t,r){"use strict";r.r(t),r.d(t,"frontMatter",(function(){return i})),r.d(t,"metadata",(function(){return o})),r.d(t,"rightToc",(function(){return l})),r.d(t,"default",(function(){return p}));var a=r(2),n=r(6),c=(r(0),r(89)),i={id:"doc6",title:"Abstract Factory Pattern"},o={unversionedId:"doc6",id:"doc6",isDocsHomePage:!1,title:"Abstract Factory Pattern",description:"- GoF:",source:"@site/docs\\doc6.md",permalink:"/docs/doc6",sidebar:"someSidebar",previous:{title:"Factory Pattern",permalink:"/docs/doc5"},next:{title:"Adapter pattern",permalink:"/docs/doc7"}},l=[{value:"Concepts",id:"concepts",children:[]},{value:"Design Considerations",id:"design-considerations",children:[]},{value:"Example/Demo",id:"exampledemo",children:[]},{value:"Drawbacks",id:"drawbacks",children:[]},{value:"Contrast to other patterns",id:"contrast-to-other-patterns",children:[]},{value:"Summary",id:"summary",children:[]}],b={rightToc:l};function p(e){var t=e.components,r=Object(n.a)(e,["components"]);return Object(c.b)("wrapper",Object(a.a)({},b,r,{components:t,mdxType:"MDXLayout"}),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},Object(c.b)("inlineCode",{parentName:"li"},"GoF"),": "),Object(c.b)("li",{parentName:"ul"},Object(c.b)("inlineCode",{parentName:"li"},"Wiki"),": "),Object(c.b)("li",{parentName:"ul"},Object(c.b)("inlineCode",{parentName:"li"},"Other"),": ")),Object(c.b)("h2",{id:"concepts"},"Concepts"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Factory of Factories"),Object(c.b)("li",{parentName:"ul"},"Factory of related Objects"),Object(c.b)("li",{parentName:"ul"},"Common Interface"),Object(c.b)("li",{parentName:"ul"},"Defer to subclasses for instantiation"),Object(c.b)("li",{parentName:"ul"},Object(c.b)("strong",{parentName:"li"},"Examples"),Object(c.b)("ul",{parentName:"li"},Object(c.b)("li",{parentName:"ul"},"DocumentBuilderFactory"),Object(c.b)("li",{parentName:"ul"},"Mostly in frameworks")))),Object(c.b)("h2",{id:"design-considerations"},"Design Considerations"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Groups Factories Together"),Object(c.b)("li",{parentName:"ul"},"Factory is responsible for lifecycle of itself"),Object(c.b)("li",{parentName:"ul"},"Common Interface"),Object(c.b)("li",{parentName:"ul"},"Concrete classes are returned from the underlying factory"),Object(c.b)("li",{parentName:"ul"},"Parameterized create method like factory pattern"),Object(c.b)("li",{parentName:"ul"},"Built using composition, not the case with Factory.")),Object(c.b)("h2",{id:"exampledemo"},"Example/Demo"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Create classes that will be used"),Object(c.b)("li",{parentName:"ul"},"Build AbstractFactory"),Object(c.b)("li",{parentName:"ul"},"Then build Factory as it will be used by abstractfactory"),Object(c.b)("li",{parentName:"ul"},"Factory returns concrete implementation")),Object(c.b)("p",null,"Flow"),Object(c.b)("pre",null,Object(c.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),"                                    CreditCardFactory (Abstract Factory)\n                    - static CreditCardFactory getCreditCardFactory(int creditScore)\n                    - abstract CreditCard getCreditCard(CardType cardType);\n                    - abstract Validator getValidator(CardType cardType);\n               ___________________________________|_________________________________\n              |                                                                     |\n        AmexFactory  (extends CreditCardFactory)                VisaFactory  (extends CreditCardFactory)\n     public CreditCard getCreditCard(CardType cardType) {\n        switch (cardType) {\n          case GOLD:\n            return new AmexGoldCreditCard();\n          case PLATINUM:\n            return new AmexPlatinumCreditCard();\n        }\n     }\n    public Validator getValidator(CardType cardType) {\n        switch (cardType) {\n          case GOLD:\n            return new AmexGoldValidator();\n          case PLATINUM:\n            return new AmexPlatinumValidator();\n        }\n    }\n")),Object(c.b)("p",null,"if you are not using the ORM and you have to use the db queries depending on the db you are using, this pattern will find implementation their."),Object(c.b)("h2",{id:"drawbacks"},"Drawbacks"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Complexity - most complex of creational design patterns"),Object(c.b)("li",{parentName:"ul"},"Runtime Switch - cleenct can change the flow by passing some parameters"),Object(c.b)("li",{parentName:"ul"},"Pattern within a pattern"),Object(c.b)("li",{parentName:"ul"},"Problem specific (limited scope)"),Object(c.b)("li",{parentName:"ul"},"Starts as a factory and the refactored to abstractFactory")),Object(c.b)("h2",{id:"contrast-to-other-patterns"},"Contrast to other patterns"),Object(c.b)("table",null,Object(c.b)("thead",{parentName:"table"},Object(c.b)("tr",{parentName:"thead"},Object(c.b)("th",Object(a.a)({parentName:"tr"},{align:null}),"Factory"),Object(c.b)("th",Object(a.a)({parentName:"tr"},{align:"center"}),"AbstractFactory"))),Object(c.b)("tbody",{parentName:"table"},Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"Returns various instances"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Implemented with a factory")),Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"- multiple constructors"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Hides the underlying concrete factory")),Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"Interface Driven"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"1 more layer of Abstraction added to  environment")),Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"Adaptable to environment more easily"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Built through composition")))),Object(c.b)("h2",{id:"summary"},"Summary"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Group of similar factories"),Object(c.b)("li",{parentName:"ul"},"Complex"),Object(c.b)("li",{parentName:"ul"},"Heavy abstraction"),Object(c.b)("li",{parentName:"ul"},"Written at framework level")))}p.isMDXComponent=!0},89:function(e,t,r){"use strict";r.d(t,"a",(function(){return d})),r.d(t,"b",(function(){return m}));var a=r(0),n=r.n(a);function c(e,t,r){return t in e?Object.defineProperty(e,t,{value:r,enumerable:!0,configurable:!0,writable:!0}):e[t]=r,e}function i(e,t){var r=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),r.push.apply(r,a)}return r}function o(e){for(var t=1;t<arguments.length;t++){var r=null!=arguments[t]?arguments[t]:{};t%2?i(Object(r),!0).forEach((function(t){c(e,t,r[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(r)):i(Object(r)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(r,t))}))}return e}function l(e,t){if(null==e)return{};var r,a,n=function(e,t){if(null==e)return{};var r,a,n={},c=Object.keys(e);for(a=0;a<c.length;a++)r=c[a],t.indexOf(r)>=0||(n[r]=e[r]);return n}(e,t);if(Object.getOwnPropertySymbols){var c=Object.getOwnPropertySymbols(e);for(a=0;a<c.length;a++)r=c[a],t.indexOf(r)>=0||Object.prototype.propertyIsEnumerable.call(e,r)&&(n[r]=e[r])}return n}var b=n.a.createContext({}),p=function(e){var t=n.a.useContext(b),r=t;return e&&(r="function"==typeof e?e(t):o(o({},t),e)),r},d=function(e){var t=p(e.components);return n.a.createElement(b.Provider,{value:t},e.children)},u={inlineCode:"code",wrapper:function(e){var t=e.children;return n.a.createElement(n.a.Fragment,{},t)}},s=n.a.forwardRef((function(e,t){var r=e.components,a=e.mdxType,c=e.originalType,i=e.parentName,b=l(e,["components","mdxType","originalType","parentName"]),d=p(r),s=a,m=d["".concat(i,".").concat(s)]||d[s]||u[s]||c;return r?n.a.createElement(m,o(o({ref:t},b),{},{components:r})):n.a.createElement(m,o({ref:t},b))}));function m(e,t){var r=arguments,a=t&&t.mdxType;if("string"==typeof e||a){var c=r.length,i=new Array(c);i[0]=s;var o={};for(var l in t)hasOwnProperty.call(t,l)&&(o[l]=t[l]);o.originalType=e,o.mdxType="string"==typeof e?e:a,i[1]=o;for(var b=2;b<c;b++)i[b]=r[b];return n.a.createElement.apply(null,i)}return n.a.createElement.apply(null,r)}s.displayName="MDXCreateElement"}}]);
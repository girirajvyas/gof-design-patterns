(window.webpackJsonp=window.webpackJsonp||[]).push([[30],{84:function(e,t,n){"use strict";n.r(t),n.d(t,"frontMatter",(function(){return o})),n.d(t,"metadata",(function(){return l})),n.d(t,"rightToc",(function(){return i})),n.d(t,"default",(function(){return p}));var a=n(2),r=n(6),c=(n(0),n(89)),o={id:"doc4",title:"Prototype Pattern"},l={unversionedId:"doc4",id:"doc4",isDocsHomePage:!1,title:"Prototype Pattern",description:"- GoF: Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype",source:"@site/docs\\doc4.md",permalink:"/docs/doc4",sidebar:"someSidebar",previous:{title:"Builder Pattern",permalink:"/docs/doc3"},next:{title:"Factory Pattern",permalink:"/docs/doc5"}},i=[{value:"Concepts",id:"concepts",children:[]},{value:"Design considerations",id:"design-considerations",children:[]},{value:"Example/Demo",id:"exampledemo",children:[]},{value:"Drawbacks",id:"drawbacks",children:[]},{value:"Contrast to other patterns",id:"contrast-to-other-patterns",children:[]},{value:"Summary",id:"summary",children:[]},{value:"Next:",id:"next",children:[]}],b={rightToc:i};function p(e){var t=e.components,n=Object(r.a)(e,["components"]);return Object(c.b)("wrapper",Object(a.a)({},b,n,{components:t,mdxType:"MDXLayout"}),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},Object(c.b)("inlineCode",{parentName:"li"},"GoF"),": Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype"),Object(c.b)("li",{parentName:"ul"},Object(c.b)("inlineCode",{parentName:"li"},"Wiki"),": "),Object(c.b)("li",{parentName:"ul"},Object(c.b)("inlineCode",{parentName:"li"},"Other"),": creates copy of objects that are very expensive to create")),Object(c.b)("h2",{id:"concepts"},"Concepts"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Avoids costly creation"),Object(c.b)("li",{parentName:"ul"},"Avoids Subclassing"),Object(c.b)("li",{parentName:"ul"},'Typically doesn\'t use keyword "new"'),Object(c.b)("li",{parentName:"ul"},"Often utilizes an Interface"),Object(c.b)("li",{parentName:"ul"},"Usually implemented with a registry"),Object(c.b)("li",{parentName:"ul"},Object(c.b)("strong",{parentName:"li"},"Example:"),Object(c.b)("ul",{parentName:"li"},Object(c.b)("li",{parentName:"ul"},"java.lang.Object#clone()")))),Object(c.b)("h2",{id:"design-considerations"},"Design considerations"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Typically implements clone/cloneable"),Object(c.b)("li",{parentName:"ul"},'Avoids keyword "new"'),Object(c.b)("li",{parentName:"ul"},"Although copy, each instance is unique"),Object(c.b)("li",{parentName:"ul"},"Costly construction not handled by client (builder is opposite of prototype)"),Object(c.b)("li",{parentName:"ul"},"Can still utilize parameters for construction"),Object(c.b)("li",{parentName:"ul"},"Shallow vs deep copy design considerations can be made ")),Object(c.b)("h2",{id:"exampledemo"},"Example/Demo"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Create Prototype"),Object(c.b)("li",{parentName:"ul"},"Demonstrate shallow copy"),Object(c.b)("li",{parentName:"ul"},"Create with a registry")),Object(c.b)("p",null,"Note: "),Object(c.b)("ol",null,Object(c.b)("li",{parentName:"ol"},"We have seen an example with ",Object(c.b)("inlineCode",{parentName:"li"},"clone()")," method, but this can also be achieved by creatin an interface and implementing the clone method."),Object(c.b)("li",{parentName:"ol"},"You can replace string with enum in createItem method of registry.")),Object(c.b)("h2",{id:"drawbacks"},"Drawbacks"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Sometimes not clear when to use"),Object(c.b)("li",{parentName:"ul"},"Used with other patterns",Object(c.b)("ul",{parentName:"li"},Object(c.b)("li",{parentName:"ul"},"Registry"))),Object(c.b)("li",{parentName:"ul"},"Mostly shallow copy by clone, for deep copy we have to implement ourselves and it requires a lot of code")),Object(c.b)("h2",{id:"contrast-to-other-patterns"},"Contrast to other patterns"),Object(c.b)("table",null,Object(c.b)("thead",{parentName:"table"},Object(c.b)("tr",{parentName:"thead"},Object(c.b)("th",Object(a.a)({parentName:"tr"},{align:null}),"Prototype"),Object(c.b)("th",Object(a.a)({parentName:"tr"},{align:"center"}),"Factory"))),Object(c.b)("tbody",{parentName:"table"},Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"Light weight construction"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Flexible Objects based on request")),Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"- Copy constructor or clone method"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"- multiple constructors can be use instead of just clone method")),Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"Choose shallow vs deep copy"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Create fresh and cconcrete instance of object")),Object(c.b)("tr",{parentName:"tbody"},Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"Main purpose to create copy of itself"),Object(c.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"NA")))),Object(c.b)("h2",{id:"summary"},"Summary"),Object(c.b)("ul",null,Object(c.b)("li",{parentName:"ul"},"Guarantee unique instance"),Object(c.b)("li",{parentName:"ul"},"Often refactored in "),Object(c.b)("li",{parentName:"ul"},"Can help with performance issues"),Object(c.b)("li",{parentName:"ul"},"Dont always jump to a factory")),Object(c.b)("blockquote",null,Object(c.b)("p",{parentName:"blockquote"},"Prototype patterns are usually implemented with a Registry")),Object(c.b)("blockquote",null,Object(c.b)("p",{parentName:"blockquote"},"A Prototype is used when you want to guarantee a unique instance that is lightweight to create")),Object(c.b)("h2",{id:"next"},"Next:"),Object(c.b)("p",null,"you can try prototype pattern with Generics and without clone method\nReferences: ",Object(c.b)("a",Object(a.a)({parentName:"p"},{href:"https://refactoring.guru/design-patterns/prototype"}),"https://refactoring.guru/design-patterns/prototype")))}p.isMDXComponent=!0},89:function(e,t,n){"use strict";n.d(t,"a",(function(){return u})),n.d(t,"b",(function(){return d}));var a=n(0),r=n.n(a);function c(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function o(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,a)}return n}function l(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?o(Object(n),!0).forEach((function(t){c(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):o(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function i(e,t){if(null==e)return{};var n,a,r=function(e,t){if(null==e)return{};var n,a,r={},c=Object.keys(e);for(a=0;a<c.length;a++)n=c[a],t.indexOf(n)>=0||(r[n]=e[n]);return r}(e,t);if(Object.getOwnPropertySymbols){var c=Object.getOwnPropertySymbols(e);for(a=0;a<c.length;a++)n=c[a],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(r[n]=e[n])}return r}var b=r.a.createContext({}),p=function(e){var t=r.a.useContext(b),n=t;return e&&(n="function"==typeof e?e(t):l(l({},t),e)),n},u=function(e){var t=p(e.components);return r.a.createElement(b.Provider,{value:t},e.children)},s={inlineCode:"code",wrapper:function(e){var t=e.children;return r.a.createElement(r.a.Fragment,{},t)}},m=r.a.forwardRef((function(e,t){var n=e.components,a=e.mdxType,c=e.originalType,o=e.parentName,b=i(e,["components","mdxType","originalType","parentName"]),u=p(n),m=a,d=u["".concat(o,".").concat(m)]||u[m]||s[m]||c;return n?r.a.createElement(d,l(l({ref:t},b),{},{components:n})):r.a.createElement(d,l({ref:t},b))}));function d(e,t){var n=arguments,a=t&&t.mdxType;if("string"==typeof e||a){var c=n.length,o=new Array(c);o[0]=m;var l={};for(var i in t)hasOwnProperty.call(t,i)&&(l[i]=t[i]);l.originalType=e,l.mdxType="string"==typeof e?e:a,o[1]=l;for(var b=2;b<c;b++)o[b]=n[b];return r.a.createElement.apply(null,o)}return r.a.createElement.apply(null,n)}m.displayName="MDXCreateElement"}}]);
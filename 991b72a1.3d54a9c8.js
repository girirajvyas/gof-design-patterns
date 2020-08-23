(window.webpackJsonp=window.webpackJsonp||[]).push([[17],{72:function(e,t,n){"use strict";n.r(t),n.d(t,"frontMatter",(function(){return r})),n.d(t,"metadata",(function(){return o})),n.d(t,"rightToc",(function(){return c})),n.d(t,"default",(function(){return b}));var a=n(2),i=n(6),l=(n(0),n(89)),r={id:"doc2",title:"Singleton Pattern"},o={unversionedId:"doc2",id:"doc2",isDocsHomePage:!1,title:"Singleton Pattern",description:"- GoF: Ensure a class only has one instance, and provide a global point of contact to access it.",source:"@site/docs\\doc2.md",permalink:"/gof-design-patterns/docs/doc2",sidebar:"someSidebar",previous:{title:"GoF Design Patterns",permalink:"/gof-design-patterns/docs/"},next:{title:"Builder Pattern",permalink:"/gof-design-patterns/docs/doc3"}},c=[{value:"Concepts:",id:"concepts",children:[]},{value:"Design considerations",id:"design-considerations",children:[]},{value:"Everyday Example in use",id:"everyday-example-in-use",children:[]},{value:"Demo",id:"demo",children:[]},{value:"Drawbacks",id:"drawbacks",children:[]},{value:"Contrast to other patterns",id:"contrast-to-other-patterns",children:[]},{value:"Summary",id:"summary",children:[]},{value:"Next",id:"next",children:[]}],s={rightToc:c};function b(e){var t=e.components,n=Object(i.a)(e,["components"]);return Object(l.b)("wrapper",Object(a.a)({},s,n,{components:t,mdxType:"MDXLayout"}),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},Object(l.b)("inlineCode",{parentName:"li"},"GoF"),": Ensure a class only has ",Object(l.b)("inlineCode",{parentName:"li"},"one instance"),", and provide a global point of contact to access it. "),Object(l.b)("li",{parentName:"ul"},Object(l.b)("inlineCode",{parentName:"li"},"Wiki"),': Restricts the instantiation of a class to one "single" instance.')),Object(l.b)("h2",{id:"concepts"},"Concepts:"),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Only one instance created. It is achieved by providing only one entry point to create the new instance of the class"),Object(l.b)("li",{parentName:"ul"},"Useful where we have to control the resources, such as database connections or sockets "),Object(l.b)("li",{parentName:"ul"},"Lazily loaded (usually)"),Object(l.b)("li",{parentName:"ul"},Object(l.b)("strong",{parentName:"li"},"Examples:"),"  ",Object(l.b)("ul",{parentName:"li"},Object(l.b)("li",{parentName:"ul"},"Runtime.java  "),Object(l.b)("li",{parentName:"ul"},"Logger (singleton or factory)"),Object(l.b)("li",{parentName:"ul"},"Spring beans (by default, scope is singleton in spring)")))),Object(l.b)("h2",{id:"design-considerations"},"Design considerations"),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Class is responsible for creating itself and its lifecycle"),Object(l.b)("li",{parentName:"ul"},"Private instance"),Object(l.b)("li",{parentName:"ul"},"Private constructor"),Object(l.b)("li",{parentName:"ul"},"Static in nature, but not implemented via static class  as it does not guarantee it will be thread safe (contradicts bill pugh implementation, verify this)"),Object(l.b)("li",{parentName:"ul"},"No parameters required for construction, in case parameter is required for construction than it violates singleton.")),Object(l.b)("h2",{id:"everyday-example-in-use"},"Everyday Example in use"),Object(l.b)("pre",null,Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),'    Runtime singletonRuntime = Runtime.getRuntime();\n    singletonRuntime.gc();\n    System.out.println(singletonRuntime);\n    \n    Runtime anotherInstance = Runtime.getRuntime();\n    System.out.println(anotherInstance);\n    \n    if (singletonRuntime == anotherInstance) {\n            System.out.println("They are the same instance");\n    }\n')),Object(l.b)("h2",{id:"demo"},"Demo"),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Steps to create:"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"We have 5 major versions of Singleton",Object(l.b)("ul",{parentName:"li"},Object(l.b)("li",{parentName:"ul"},"Eager initialization"),Object(l.b)("li",{parentName:"ul"},"Lazy initialization with synchronized method"),Object(l.b)("li",{parentName:"ul"},"Lazy initialization with double check locking method"),Object(l.b)("li",{parentName:"ul"},"Lazy initialized with static inner class"),Object(l.b)("li",{parentName:"ul"},"Lazy initialized with ",Object(l.b)("inlineCode",{parentName:"li"},"Enum")," which leads to less code. (Recommended by Joshua bloch in Effective Java)")))),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Common step:"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Create a class with ",Object(l.b)("inlineCode",{parentName:"li"},"private constructor")," to prevent initialization.  "),Object(l.b)("li",{parentName:"ul"},"Making constructor private prevents the initialization via ",Object(l.b)("inlineCode",{parentName:"li"},"new")," keyword"),Object(l.b)("li",{parentName:"ul"},"We expose a public static method (commonly named ",Object(l.b)("inlineCode",{parentName:"li"},"getInstance()"),") to provide the single entry point that returns its instance ")),Object(l.b)("pre",null,Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),"public class Singleton {\n  private Singleton() {\n }\n \n public static Singleton getInstance(){\n }\n}\n")),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Eager Initialization"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Instance is created at the time of class loading, this is the easiest method to create a singleton class."),Object(l.b)("li",{parentName:"ul"},"Create a static final class variable INSTANCE and initialize this with new instance of class"),Object(l.b)("li",{parentName:"ul"},"Create static method that returns this instance.")),Object(l.b)("pre",null,Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),"public class SingletonEager {\n\n  private static final SingletonEager INSTANCE = new SingletonEager();\n\n  private SingletonEager() {}\n\n  public static SingletonEager getInstance() {\n    return INSTANCE;\n  }\n}\n")),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},Object(l.b)("strong",{parentName:"li"},"Disadvantages"),Object(l.b)("ul",{parentName:"li"},Object(l.b)("li",{parentName:"ul"},"Instance is created even if the client application may not be using it."),Object(l.b)("li",{parentName:"ul"},"It will create an issue if your singleton class in creating a database connection or creating a socket which may lead to memory leak problem.")))),Object(l.b)("blockquote",null,Object(l.b)("p",{parentName:"blockquote"},"As a general rule, we name the method as getInstance(), this is just convention and not mandatorily to be followed")),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Prevent initialization via Reflection"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"To prevent from initialization via reflection, you can throw exception from constructor")),Object(l.b)("pre",null,Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),'  private Singleton() {\n    // In case Reflection is used for initialization\n    if (INSTANCE != null) {\n      throw new RuntimeException("Please instantiate via getInstance() method");\n    }\n  }\n')),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Lazy initialization with synchronized method"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Create a static class variable INSTANCE."),Object(l.b)("li",{parentName:"ul"},"Create a synchronized method to return instance. If it is not initialized, initialize it and return."),Object(l.b)("li",{parentName:"ul"},"In case you do not make method synchronized, multiple instances might be created in multithreaded environment")),Object(l.b)("pre",null,Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),'public class SingletonLazyWithSynchronizedMethod {\n\n  private static SingletonLazyWithSynchronizedMethod INSTANCE;\n\n  private SingletonLazyWithSynchronizedMethod() {\n    if (INSTANCE != null) {\n      throw new RuntimeException("Please instantiate via getInstance() method");\n    }\n  }\n\n  public static synchronized SingletonLazyWithSynchronizedMethod getInstance() {\n    if (INSTANCE == null) {\n      INSTANCE = new SingletonLazyWithSynchronizedMethod();\n    }\n    return INSTANCE;\n  }\n}\n')),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},Object(l.b)("strong",{parentName:"li"},"Disadvantages"),Object(l.b)("ul",{parentName:"li"},Object(l.b)("li",{parentName:"ul"},"Slow performance because of locking overheand in every call"),Object(l.b)("li",{parentName:"ul"},"Unnecessary synchronization that is not required once the instance variable is initialized."),Object(l.b)("li",{parentName:"ul"},"Demo of multiple instances in case method is not synchronized",Object(l.b)("pre",{parentName:"li"},Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),'  private static void lazySingletonMultiThreadsIssueDemo() {\n  Thread t1 = new Thread(() ->  {\n    SingletonLazy instance1 = SingletonLazy.getInstance();\n    System.out.println("Hashcode of instance1: "+ instance1.hashCode());\n  });\n  \n  Thread t2 = new Thread(() ->  {\n    SingletonLazy instance2 = SingletonLazy.getInstance();\n    System.out.println("Hashcode of instance2: "+ instance2.hashCode());\n  });\n  \n  t1.start();\n  t2.start();\n  \n  Output:\n  Hashcode of instance1: 60675678\n  Hashcode of instance2: 1100599114\n  Note: you might have to run this quite a few times to see this different output.\n  As, you cannot predict the thread behaviour\n  }\n')))))),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Lazy initialization with synchronized block"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"To overcome above slow performance issue we will use this way for initialization."),Object(l.b)("li",{parentName:"ul"},"Create a static class variable INSTANCE. "),Object(l.b)("li",{parentName:"ul"},"We are marking this variable ",Object(l.b)("inlineCode",{parentName:"li"},"volatile"),", so that any changes to this instance are visible to other threads instantly"),Object(l.b)("li",{parentName:"ul"},"You can return instance if it is already initialized. Now, we add conditions when the instance is null. We create a synchroniized block and create an instance inside this block. We add an additional null check to avoid duplicate initialization because of two threads."),Object(l.b)("li",{parentName:"ul"},"Synchronized block will be executed only when the INSTANCE is null and prevent unnecessary synchronization once the instance variable is initialized")),Object(l.b)("pre",null,Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),'public class SingletonLazyWithDoubleCheckLocking {\n\n  private static volatile SingletonLazyWithDoubleCheckLocking INSTANCE;\n\n  private SingletonLazyWithDoubleCheckLocking() {\n    if (INSTANCE != null) {\n      throw new RuntimeException("Please instantiate via getInstance() method");\n    }\n  }\n\n  public static SingletonLazyWithDoubleCheckLocking getInstance() {\n    // Check synchronization only if the instance is null. There will be a\n    // little impact in performance only for the first time.\n    if (INSTANCE == null) {\n      synchronized (Singleton.class) {\n        // double check if instance is still null, It can be the case that till the time\n        // thread2 reaches here, thread1 has already initialized the instance\n        if (INSTANCE == null) {\n          INSTANCE = new SingletonLazyWithDoubleCheckLocking();\n        }\n      }\n    }\n    return INSTANCE;\n  }\n}\n')),Object(l.b)("blockquote",null,Object(l.b)("p",{parentName:"blockquote"},"Without volatile modifier, it\u2019s possible for another thread in Java to see half initialized state of INSTANCE variable, but with volatile variable guaranteeing happens-before relationship, all the write will happen on volatile INSTANCE before any read of INSTANCE variable.")),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Prevent duplicate object creation via serialization"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"In case of serializing the Singleton class, you might not get the same instance. to solve this issue you have to implement readresolve method")),Object(l.b)("pre",null,Object(l.b)("code",Object(a.a)({parentName:"pre"},{className:"language-java"}),"    protected Singleton readResolve() {\n        return INSTANCE;\n    }\n")),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Lazy initialization with static inner class"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"TODO, code available")),Object(l.b)("p",null,Object(l.b)("strong",{parentName:"p"},"Enum Singleton"),"  "),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Implementation added with DbSingletonEnum")),Object(l.b)("blockquote",null,Object(l.b)("p",{parentName:"blockquote"},"The best way to implement a ",Object(l.b)("inlineCode",{parentName:"p"},"Serializable Singleton")," is to use an Enum")),Object(l.b)("blockquote",null,Object(l.b)("p",{parentName:"blockquote"},"From Joshua Bloch's Effective Java: This approach is functionally equivalent to the public field approach, except that it is more concise, provides the serialization machinery for free, and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks. While this approach has yet to be widely adopted, a single-element enum type is the best way to implement a singleton.")),Object(l.b)("h2",{id:"drawbacks"},"Drawbacks"),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Often overused"),Object(l.b)("li",{parentName:"ul"},"Difficult to unit test"),Object(l.b)("li",{parentName:"ul"},"If not careful, not threadsafe"),Object(l.b)("li",{parentName:"ul"},"Sometimes confused for factory")),Object(l.b)("blockquote",null,Object(l.b)("p",{parentName:"blockquote"},":stop_sign:   java.util.Calendar is not a Singleton, rather it is Prototype. It is confused as Singleton as it has getInstance() method.")),Object(l.b)("h2",{id:"contrast-to-other-patterns"},"Contrast to other patterns"),Object(l.b)("table",null,Object(l.b)("thead",{parentName:"table"},Object(l.b)("tr",{parentName:"thead"},Object(l.b)("th",Object(a.a)({parentName:"tr"},{align:null}),"Singleton"),Object(l.b)("th",Object(a.a)({parentName:"tr"},{align:"center"}),"Factory"))),Object(l.b)("tbody",{parentName:"table"},Object(l.b)("tr",{parentName:"tbody"},Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"Returns same instance"),Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Returns various instances")),Object(l.b)("tr",{parentName:"tbody"},Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"One constructor method - no args"),Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Multiple constructors")),Object(l.b)("tr",{parentName:"tbody"},Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"No interface"),Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Interface Driven")),Object(l.b)("tr",{parentName:"tbody"},Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"No Subclasses"),Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Always SubClasses are involved in a way or other")),Object(l.b)("tr",{parentName:"tbody"},Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:null}),"NA"),Object(l.b)("td",Object(a.a)({parentName:"tr"},{align:"center"}),"Adaptable to environment more easily**")))),Object(l.b)("h2",{id:"summary"},"Summary"),Object(l.b)("ul",null,Object(l.b)("li",{parentName:"ul"},"Guarantees one instance"),Object(l.b)("li",{parentName:"ul"},"Easy to implement"),Object(l.b)("li",{parentName:"ul"},"Solves a well defined problem"),Object(l.b)("li",{parentName:"ul"},"You can still violate the Singleton principle by creating more than one instance of the Singleton class by using cloning or using multiple class loaders"),Object(l.b)("li",{parentName:"ul"},"Don't abuse it")),Object(l.b)("h2",{id:"next"},"Next"),Object(l.b)("p",null,"Explore the Enum version of Singleton pattern"))}b.isMDXComponent=!0},89:function(e,t,n){"use strict";n.d(t,"a",(function(){return u})),n.d(t,"b",(function(){return d}));var a=n(0),i=n.n(a);function l(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function r(e,t){var n=Object.keys(e);if(Object.getOwnPropertySymbols){var a=Object.getOwnPropertySymbols(e);t&&(a=a.filter((function(t){return Object.getOwnPropertyDescriptor(e,t).enumerable}))),n.push.apply(n,a)}return n}function o(e){for(var t=1;t<arguments.length;t++){var n=null!=arguments[t]?arguments[t]:{};t%2?r(Object(n),!0).forEach((function(t){l(e,t,n[t])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(n)):r(Object(n)).forEach((function(t){Object.defineProperty(e,t,Object.getOwnPropertyDescriptor(n,t))}))}return e}function c(e,t){if(null==e)return{};var n,a,i=function(e,t){if(null==e)return{};var n,a,i={},l=Object.keys(e);for(a=0;a<l.length;a++)n=l[a],t.indexOf(n)>=0||(i[n]=e[n]);return i}(e,t);if(Object.getOwnPropertySymbols){var l=Object.getOwnPropertySymbols(e);for(a=0;a<l.length;a++)n=l[a],t.indexOf(n)>=0||Object.prototype.propertyIsEnumerable.call(e,n)&&(i[n]=e[n])}return i}var s=i.a.createContext({}),b=function(e){var t=i.a.useContext(s),n=t;return e&&(n="function"==typeof e?e(t):o(o({},t),e)),n},u=function(e){var t=b(e.components);return i.a.createElement(s.Provider,{value:t},e.children)},p={inlineCode:"code",wrapper:function(e){var t=e.children;return i.a.createElement(i.a.Fragment,{},t)}},m=i.a.forwardRef((function(e,t){var n=e.components,a=e.mdxType,l=e.originalType,r=e.parentName,s=c(e,["components","mdxType","originalType","parentName"]),u=b(n),m=a,d=u["".concat(r,".").concat(m)]||u[m]||p[m]||l;return n?i.a.createElement(d,o(o({ref:t},s),{},{components:n})):i.a.createElement(d,o({ref:t},s))}));function d(e,t){var n=arguments,a=t&&t.mdxType;if("string"==typeof e||a){var l=n.length,r=new Array(l);r[0]=m;var o={};for(var c in t)hasOwnProperty.call(t,c)&&(o[c]=t[c]);o.originalType=e,o.mdxType="string"==typeof e?e:a,r[1]=o;for(var s=2;s<l;s++)r[s]=n[s];return i.a.createElement.apply(null,r)}return i.a.createElement.apply(null,n)}m.displayName="MDXCreateElement"}}]);
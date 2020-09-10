## Arquitetura Projeto

- Linguagem - [Java 8](https://www.java.com/pt_BR/  "Java 8")

- Orquestrador de testes - [TestNG 6.14.3](https://testng.org/doc/  "TestNG 6.14.3")

- Relatório de testes automatizados - [ExtentReports 3.1.5](http://extentreports.com/docs/versions/3/net/  "ExtentReports 3.1.5")

- Framework interação com elementos web - [Selenium.WebDriver 3.141.59](https://www.seleniumhq.org/download/  "Selenium.WebDriver")

- Framework interação com elementos mobile - [Appium 1.13.0](http://appium.io/  "Appium")

  

## Arquitetura

**Premissas de uma boa arquitetura de automação de testes:**

* Facilitar o desenvolvimento dos testes automatizados (reuso).

* Facilitar a manutenção dos testes (refatoração).

* Tornar o fluxo do teste o mais legível possível (fácil entendimento do que está sendo testado).

**Configurações e setup**

- Para a plataforma Android: utilize o material de configuração [**Appium SetUp Android**
](https://docs.google.com/document/d/15kJAXjjkMVfStGVl0HKcI6ul299MIG-H4fULLOhJRmw/edit?usp=sharing)
- Para a plataforma iOS: utilize o material de configuração [**Appium SetUp iOS**](https://docs.google.com/document/d/10OHI-McBf4j0I__wFXK6yzEfKdsQ6o7UDdYjFnQsDt0/edit?usp=sharing)




  
  
  

**Parametrização de variáveis**

  

Para os parâmetros do appium, credenciais, servidor, devices e demais, utilize o arquivo **globalParameters.properties**:

  

![alt text](https://i.imgur.com/FESL5Yr.png)

**Utilizar novo aplicativo para ser testado**

- No diretório "resources/app" existem duas pastas: "android" e "ios". Utilize tais pastas para armazenar os arquivos do aplicativo (.apk, .ipa)

![alt text](https://imgur.com/c75q6dW.png)

**Flows**

Flows ou fluxos, é a camada onde há um agrupamento de atividades, ações e validações para determinada página do sistema. Um exemplo prático é um fluxo de realizarLoginAmbienteTesteZero onde são necessárias quatro ações de preencherLogin, preencherSenha, clicarBotaoLogin e selecionar o ambiente. A utilidade é facilitar o reuso de ações.

**Pages**

Mapeamento dos elementos bem como as ações simples que podem ser através do Flows.

![alt text](https://i.imgur.com/LXFW5LB.png)

OBS: Com a utilizacao do [AppiumFieldDecorator](https://appium.github.io/java-client/io/appium/java_client/pagefactory/AppiumFieldDecorator.html"AppiumFieldDecorator") é possivel utilizar os recursos de "@AndroidFindBy" e "@iOSFindBy" podendo assim, utilizar diferentes formas de localização de um elemento dependendo do sistema operacional utilizado pelo device.

Isso faz com que seja possivel utilizar uma mesma Page tanto para ios quanto para android na grande maioria dos casos.

Maiores informações: [Appium Page-objects](https://github.com/appium/java-client/blob/master/docs/Page-objects.md  "Appium Page-objects")

**Bases**

Camada subdivida em duas classes principais:

-  **TestBase** - Classe responsável por iniciar e finalizar o servidor Appium, os reports e os drivers para testes envolvendo dispositivos Android e iOS

-  **PageBase** - Classe responsável por ter métodos genéricos de ações em MobileElements, ListMobileElements e WebElements.

**Utils**

  

Camada ligada ao core da arquitetura subdivida em três em classes principais:

- DriverFactory - classe com instância do driver bem como a escolha do sistema operacional mobile e configurações que serão utilizadas. Utilize os parâmetros no arquivo **globalParameters.properties** confome a sua forma de execução:

  

![enter image description here](https://i.imgur.com/Pxd31to.png)

  

Arquivo DriverFactory para execuções:

Permite executar testes Android:

- Device real Local utilizando o apk

- Device real Local utilizando aplicativo já instalado

- Device farm BrowserStack

Permite executar testes iOS:

- Device real Local utilizando o IPA com Appium Studio

- Device real Local utilizando o IPA com Appium (sistema operacional Mac OS)

- Device farm BrowserStack

![alt text](https://i.imgur.com/rvoTMuJ.png)

  

Dicas de capabilities:

[Appium Desired Capabilities](http://appium.io/docs/en/writing-running-appium/caps/  "Appium Desired Capabilities")

[Appium Desired Capabilities by Cloud Grey](https://caps.cloudgrey.io/  "Appium Desired Capabilities by Cloud Grey")

- Utils - métodos genéricos que podem ser usados durante qualquer parte de um teste.

- ExtentReportsHelpers - métodos referentes ao relatório de execução dos testes automatizados. Toda execução de teste automatizado provê um resultado e screenshots que são armazenados na pasta dos binários Reports;
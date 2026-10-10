# laboratorio_is04

Descripción detallada de como Ejecutar el Software del caso de uso "Solicitar saludo"
El sistema esta empaquetado ocmo una aplicaicon ejecutable para Windows. El paquete incluye los componentes necesarios para ejecutar la aplicación, por lo que el equipo de destino no debería necesitar una instalación independiente de Java ni Maven.

Despues de crear un directorio para a clonacion del repositorio, se obtiene una carpeta de distribución denominada SistemaSaludador, ubicada dentro del directorio dist. La estructura principal es la siguiente:

*dist/:* directorio que contiene la distribución generada.
*dist/SistemaSaludador/:* carpeta principal de la aplicación.
*dist/SistemaSaludador/SistemaSaludador.exe:* ejecutable utilizado para iniciar el sistema.
*dist/SistemaSaludador/app/:* contiene el archivo JAR de la aplicación, su configuración y otros archivos necesarios.
*dist/SistemaSaludador/runtime/:* contiene el entorno de ejecución de Java incluido en el paquete.

Los archivos internos deben conservarse en sus ubicaciones originales, ya que el ejecutable depende de ellos para iniciar correctamente. Para iniciar el Sistema Saludador, se deben seguir los siguientes pasos:

- Localizar la carpeta de distribución. Abrir el directorio del proyecto y acceder a la carpeta dist, donde se encuentra la distribución generada.
- Ingresar a la carpeta de la aplicación. Abrir dist/SistemaSaludador.
- Ejecutar el programa. Buscar el archivo SistemaSaludador.exe y hacer doble clic sobre él.
- Esperar el inicio de la interfaz. El sistema abrirá su ventana principal, desde la cual se podrán ingresar los datos solicitados y utilizar las funcionalidades implementadas.
- Utilizar la aplicación. Completar los campos disponibles y seleccionar las opciones correspondientes para generar el saludo.
- La ejecución normal se realiza mediante el archivo .exe; no es necesario abrir una terminal ni ejecutar comandos de Maven.

La carpeta distribuida debe mantenerse completa y sin alterar la ubicación de sus componentes internos. Esta versión está destinada a ejecutar la aplicación ya compilada. Para modificar el código fuente o volver a compilar el proyecto, sí será necesario utilizar el entorno de desarrollo y las herramientas correspondientes.
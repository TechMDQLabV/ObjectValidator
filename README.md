# RETAIL - Business API
### Indice
1. [Descripción del servicio](#descripción-del-servicio)
2. Operaciones
    1. [create](#create)
        1. [Ejemplo de Invocación - JSON](#ejemplo-de-invocación-json)
        2. [Diagrama de secuencia](#diagrama-de-secuencia)
    2. [validateAddress](#validateaddress)
        1. [Ejemplo de Invocación - JSON](#ejemplo-de-invocación-json-1)
            1. Response [Caso 1.](#caso-1)
            2. Response [Caso 2.](#caso-2)
        2. [Diagrama de secuencia](#diagrama-de-secuencia-1)
    3. [registerPerson](#registerperson)
        1. [Ejemplo de Invocación - JSON](#ejemplo-de-invocación-json-2)
        2. [Diagrama de secuencia](#diagrama-de-secuencia-2)
    4. [getCountries](#getcountries)
        1. [Ejemplo de Invocación - JSON](#ejemplo-de-invocación-json-3)
        2. [Diagrama de secuencia](#diagrama-de-secuencia-3)
3. [Log - Datos sensibles](#log-datos-sensibles)
4. URLs
    1. [create](#create-1)
    2. [validateAddress](#validateaddress-1)
    3. [registerPerson](#registerperson-1)
    4. [getCountries](#getcountries-1)

___

## onboarding (v1.0.0)
### Descripción del servicio
El servicio `onboarding` contiene la lógica de negocio que permite, por medio de sus operaciones, crear, consultar, registrar y validar datos según corresponda. Actualmente, estas operaciones realizan llamados a servicios pertenecientes al _motor de On Boarding_.

Este servicio cuenta con las operaciones:
* [create](#create)
* [validateAddress](#validateaddress)
* [registerPerson](#registerperson)
* [getCountries](#getcountries)

___

## create
La operación `create` realiza un llamado al _motor de On Boarding_ para crear una solicitud. Dentro de la jerarquía, es la primer operación en ser ejecutada ya que se necesita del **número identificatorio de la solicitud** (`requestId`) retornada por este servicio para realizar las llamadas a las operaciones consiguientes.

La operación `create` recibe una entidad formada por:
* Código de acción comercial (`commercialActionCode`).
* Número de CUIL (`cuilNumber`).
* Número de documento (`documentNumber`).
* Tipo de documento (`documentTypeCode`).
* Sexo de la persona (`genderCode`).

y retorna una entidad formada por:
* Relación de la persona con respecto al Banco (`personConditionText`).
* Número identificatorio de la solicitud creada por el motor de On Boarding (`requestId`).
* Código de retorno de la transacción (`returnCode`).
* Descripción del código de retorno (`returnDescription`).
* Nivel del código de retorno (`returnLevelCode`).

Además, la respuesta contiene un encabezado donde figuran elementos competentes a la operación realizada.

### Ejemplo de invocación - JSON
<details>
<summary>
create - Request
</summary>
<p>

```json
{
    "header": {
        "transactionId": "12345-6789"
    },
    "data": {
        "documentTypeCode": "04",
        "documentNumber": "35487362",
        "genderCode": "M",
        "commercialActionCode": "VISA",
        "cuilNumber": "20354873622"
    }
}
```
</p>
</details>

<details>
<summary>
create - Response
</summary>
<p>

```json
{
    "header": {
        "messageCode": "HTTP200",
        "messageDescription": "Successful transaction",
        "resultCode": "ok",
        "transactionId": "8248ac90-f532-499a-91b0-bb4d60b169d2"
    },
    "data": {
        "requestId": "13674",
        "personConditionText": "NOCLIENTE",
        "returnCode": "0",
        "returnDescription": "La solicitud ha sido creada ",
        "returnLevelCode": "INFO"
    }
}
```
</p>
</details>

### Diagrama de Secuencia
El diagrama de secuencia de la operación `create` se encuentra en el siguiente hipervínculo:

* [Diagrama de Secuencia: create - (10/8/2021)](https://sequencediagram.org/index.html#initialData=)

[<<< Volver al Indice >>>](#Indice)
___

## validateAddress

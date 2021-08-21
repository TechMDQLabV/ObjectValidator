## MIDD - Technical API

# OnHost (v1.1.1)
El servicio **OnHost**, ubicado en la *Technical API*, es el mediador entre los servicios de *Altamira* y la *Business API* para todas las operaciones relacionadas a la tarjeta banelco. Como ser:

## Operaciones

1. [blanqueoPinAlfabetico](#blanqueo-pin-alfabetico)
2. [clientesConsulta](#clientesConsulta)
3. [confirmarTdvBanelco](#confirmarTdvBanelco)
4. [consEstadoBankingCard](#consEstadoBankingCard)
5. [consTarjPorHabilitar](#consTarjPorHabilitar)
6. [consTarjetasEstadoHabilit](#consTarjetasEstadoHabilit)
7. [consultaComprasElectron](#consultaComprasElectron)
8. [consultaCtasElectron](#consultaCtasElectron)
9.  [consultaNroMensajes](#consultaNroMensajes)
10. [consultarTdvBanelco](#consultarTdvBanelco)
11. [habilitacionTarjetas](#habilitacionTarjetas)
12. [pedirNrumTdvBanelco](#pedirNrumTdvBanelco)
13. [reimpresionBanking](#reimpresionBanking)
14. [tarjHabilitacionTotalIvr](#tarjHabilitacionTotalIvr)
15. [tarjetaBanelcoReimpresion](#tarjetaBanelcoReimpresion)
16. [tarjetaCambioNivel](#tarjetaCambioNivel)
17. [tarjetaConsultaLimites](#tarjetaConsultaLimites)
18. [validacionTam](#validacionTam)

> **Aclaración:** por cada operación antes nombrada se detallara los ejemplos de invocación, diagrama y URLs correspondientes.



## blanqueoPinAlfabetico
Se utiliza para recuperar o habilitar la clave PIL alfabetica.

<details>
<summary>
Request - blanqueoPinAlfabeticoInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "nroTarjeta": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - blanqueoPinAlfabeticoOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "nroOperacion": "string",
        "msjOperacion": "string"
    }
}
```

</p>
</details>

<details>
    <summary>
        Response - UnexpectedError
    </summary>
    <p>

        ```json
            {
                "header": {
                    "messageCode": "WC100",
                    "messageDescription": "No data found",
                    "resultCode": "ok",
                    "serviceInstance": {
                        "system": "retail",
                        "name": "com.midd.test.service.AccountsService",
                        "operation": "listAccounts",
                        "version": "1.0.4",
                        "ip": "10.11.12.13",
                        "port": 28080,
                        "layer": "service",
                        "index": 2,
                        "latency": 247
                    },
                    "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
                    "error": [
                        {
                            "code": "WC100",
                            "description": "No data found",
                            "id": "accountNumber"
                        }
                    ],
                    "errorDetail": [
                        {
                            "code": "WC100",
                            "description": "No data found",
                            "id": "accountNumber"
                        }
                    ]
                }
            }
        ```
    </p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local/on-host/1.1/blanqueo-pin-alfabetico

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local/on-host/1.1/blanqueo-pin-alfabetico

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local/on-host/1.1/blanqueo-pin-alfabetico

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local/on-host/1.1/blanqueo-pin-alfabetico

Volver a [Operaciones](#Operaciones).


## clientesConsulta
Se utiliza para la obtención de datos del cliente por medio del número de documente y tipo.

<details>
<summary>
Request - clientesConsultaInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "tdoc521": "string",
        "ndoc521": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - clientesConsultaOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "tdoc521": "string",
        "ndoc521": "string",
        "razs521": "string",
        "telf521": "string",
        "usua521": "string",
        "fech521": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local/on-host/1.1/clientes-consulta

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local/on-host/1.1/clientes-consulta

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local/on-host/1.1/clientes-consulta

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local/on-host/1.1/clientes-consulta

Volver a [Operaciones](#Operaciones).


## confirmarTdvBanelco

<details>
<summary>
Request - confirmarTdvBanelco
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "cta1": "string",
        "cta10": "string",
        "cta11": "string",
        "cta12": "string",
        "cta13": "string",
        "cta14": "string",
        "cta15": "string",
        "cta16": "string",
        "cta2": "string",
        "cta3": "string",
        "cta4": "string",
        "cta5": "string",
        "cta6": "string",
        "cta7": "string",
        "cta8": "string",
        "cta9": "string",
        "cvv2": "string",
        "nroclie": "string",
        "opcion": "Valor: N / C ",
        "sucur": "string",
        "tarjeta": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - confirmarTdvBanelco
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "carcel": "string",
        "carlab": "string",
        "carpar": "string",
        "claiden": "string",
        "clase": "string",
        "codiden": "string",
        "cpostal": "string",
        "cvv2o": "string",
        "depto": "string",
        "direcc": "string",
        "email": "string",
        "estciv": "string",
        "fecalta": "aaaammdd",
        "fecnac": "aaaammdd",
        "fecvenc": "aaaammdd",
        "inddup": "Valor:S/N",
        "localid": "string",
        "miembro": "Valor: 001",
        "nomyape": "string",
        "numcel": "string",
        "numero": "string",
        "numlab": "string",
        "numpar": "string",
        "numtarj": "string",
        "opercel": "string",
        "piso": "string",
        "precel": "string",
        "prelab": "string",
        "prepar": "string",
        "prov": "string",
        "sexo": "Valor: M/F",
        "suctar": "0nnn"
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/confirmar-tdv-banelco

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/confirmar-tdv-banelco

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/confirmar-tdv-banelco

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/confirmar-tdv-banelco

Volver a [Operaciones](#Operaciones).


## consEstadoBankingCard

<details>
<summary>
Request - consEstadoBankingCardInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "nroclie": "string",
        "operaci": "string",
        "canalco": "string",
        "nrotarj": "string",
        "estado": "string",
        "codrech": "string",
        "desrech": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - consEstadoBankingCardOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "nroclie": "string",
        "operaci": "string",
        "canalco": "string",
        "nrotarj": "string",
        "estado": "string",
        "codrech": "string",
        "desrech": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-estado-banking-card

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-estado-banking-card

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-estado-banking-card

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/cons-estado-banking-card

Volver a [Operaciones](#Operaciones).


## consTarjPorHabilitar

<details>
<summary>
Request - consTarjPorHabilitarInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "tipotar": "string",
        "tipocli": "string",
        "estado": "string",
        "tipodoc": "string",
        "nrodoc": "string",
        "numclie": "string",
        "funcion": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - consTarjPorHabilitarOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "consTarjPorHabilitarGenerals": {
            "consTarjPorHabilitarGenerals": [
                {
                    "tipoS": "string",
                    "tipotarS": "string",
                    "tarjetaS": "string",
                    "denomS": "string",
                    "estadoS": "string",
                    "canalS": "string"
                }
            ]
        }
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-tarj-por-habilitar

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-tarj-por-habilitar

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-tarj-por-habilitar

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/cons-tarj-por-habilitar

Volver a [Operaciones](#Operaciones).


## consTarjetasEstadoHabilit

<details>
<summary>
Request - consTarjetasEstadoHabilitInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "tipotar": "string",
        "tipocli": "string",
        "estado": "string",
        "tipodoc": "string",
        "nrodoc": "string",
        "numclie": "string",
        "funcion": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - consTarjetasEstadoHabilitOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "consTarjetasEstadoHabilitGenerals": {
            "consTarjetasEstadoHabilitGenerals": [
                {
                    "tipoOut": "string",
                    "tipotarOut": "string",
                    "tarjetaOut": "string",
                    "denomOut": "string",
                    "estadoOut": "string",
                    "canalOut": "string",
                    "definirOut": "string"
                }
            ]
        }
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-tarjetas-estado-habilit

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-tarjetas-estado-habilit

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/cons-tarjetas-estado-habilit

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local/on-host​/1.1​/cons-tarjetas-estado-habilit

Volver a [Operaciones](#Operaciones).


## consultaComprasElectron

<details>
<summary>
Request - consultaComprasElectronInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "opcion": "string",
        "tarjeta": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - consultaComprasElectronOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "opcion": "string",
        "tarjeta": "string",
        "cantidad": "string",
        "consultaComprasElectronGenerals": {
            "consultaComprasElectronGenerals": [
                {
                    "mes": "string",
                    "dia": "string",
                    "tipocta": "string",
                    "cuenta": "string",
                    "codoper": "string",
                    "descoper": "string",
                    "negocio": "string",
                    "moneda": "string",
                    "importe": "string"
                }
            ]
        }
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local/on-host/1.1/consulta-compras-electron

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local/on-host/1.1/consulta-compras-electron

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local/on-host/1.1/consulta-compras-electron

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local/on-host/1.1/consulta-compras-electron

Volver a [Operaciones](#Operaciones).


## consultaCtasElectron

<details>
<summary>
Request - consultaCtasElectronInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "tarjeta": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - consultaCtasElectronOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "tarjeta": "string",
        "consultaCtasElectronGenerals": {
            "consultaCtasElectronGenerals": [
                {
                    "tipoCta": "string",
                    "nroCta": "string"
                }
            ] 
        }
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consulta-ctas-electron

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consulta-ctas-electron

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consulta-ctas-electron

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/consulta-ctas-electron

Volver a [Operaciones](#Operaciones).


## consultaNroMensajes

<details>
<summary>
Request - consultaNroMensajesInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "tipdoc": "string",
        "nrodoc": "string",
        "nromens": "string",
        "interno": "string",
        "opcion": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - consultaNroMensajesOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "tipdoc": "string",
        "nrodoc": "string",
        "nromens": "string",
        "interno": "string",
        "opcion": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consulta-nro-mensajes

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consulta-nro-mensajes

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consulta-nro-mensajes

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/consulta-nro-mensajes

Volver a [Operaciones](#Operaciones).


## consultarTdvBanelco

<details>
<summary>
Request - consultarTdvBanelco
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "cta1": "string",
        "cta10": "string",
        "cta11": "string",
        "cta12": "string",
        "cta13": "string",
        "cta14": "string",
        "cta15": "string",
        "cta16": "string",
        "cta2": "string",
        "cta3": "string",
        "cta4": "string",
        "cta5": "string",
        "cta6": "string",
        "cta7": "string",
        "cta8": "string",
        "cta9": "string",
        "cvv2": "string",
        "nroclie": "string",
        "opcion": "Valor: N / C ",
        "sucur": "string",
        "tarjeta": "string"
    }
}
```

</p>
</details>

<details>
<summary>
Response - consultarTdvBanelco
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "carcel": "string",
        "carlab": "string",
        "carpar": "string",
        "claiden": "string",
        "clase": "string",
        "codiden": "string",
        "cpostal": "string",
        "cvv2o": "string",
        "depto": "string",
        "direcc": "string",
        "email": "string",
        "estciv": "string",
        "fecalta": "aaaammdd",
        "fecnac": "aaaammdd",
        "fecvenc": "aaaammdd",
        "inddup": "Valor:S/N",
        "localid": "string",
        "miembro": "Valor: 001",
        "nomyape": "string",
        "numcel": "string",
        "numero": "string",
        "numlab": "string",
        "numpar": "string",
        "numtarj": "string",
        "opercel": "string",
        "piso": "string",
        "precel": "string",
        "prelab": "string",
        "prepar": "string",
        "prov": "string",
        "sexo": "Valor: M/F",
        "suctar": "0nnn"
    }
}
```

</p>
</details>

<details>
<summary>
Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```

</p>
</details>

### Diagrama de Secuencia

[Diagrama de secuencia: consultarTdvBanelco (10/8/2021)](#https://sequencediagram.org/index.html#initialData=C4S2BsFMAIBEQIYHMBOCC2DoBMYGVIBjAV0gDtDEAuaJSYANRBWGIXFkgCMwBhBFNmgBaaAAoAjAAYA9AA4ZAJimKJASgBQGhIWAB7FNADEqSOWgBVAM6QUWgA4DQlR2WDHwIJAAtgqBACe0ABiKHpuAKJk2A5OIC4Ibsb+QREAHva2IOSEMACCAAoAkhqOLPEgru4maEEAQsRWIGSQVlbQhSVlzpWJ1SnQACpE3mTx7B3FWhrWtsIAfKHhwFHYNDbR0IQC2AByxOhctlo6oABuCMAwS5HRGjcr0QvpmSjZFPnFNABU34TeiRa4GE20EVF+tHoTBYbA43D4OzEmlwpxAFyuITCtxi2l0aMuMBeWRynxKAEgyUS3iTJkUADx04RU965WlUC6ebAEgBKkAAjqQrMAkRpmTTOgsGk0Wm02b9QWsIXRGMxWOxODxgPxBGIADpkaFquGa7XYIpkezEYA0BX7Q62TS484E6BS5qtdqdDRumWe4oM4Q+j1sjkgLlXXkC1rCx1B2US+bDf5jbbgOXfADyZAAEnoheDvltwlZiOBgAhBtgznVEpBwIQ9HqDarYRqEYJzZbrVsdnajihHaj0TAk6NxmmvaOUxME3G-UUaCh6MQUGRoLyrPZi5BDa34VqdrBLggNCi8cOhiNpxOpt7Gu748VnhliR82dAl6xV+vWluyDZd3VfdTSPctT0gIcXTnWktDFN8EweVZF2Xb8Nz-ACWyAk1D2PLQz2dDE4NZL0nXxDFELuCjsAWWYUGQr810A4122wUCT3wsjrixR4cS0IA)

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consultar-tdv-banelco

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consultar-tdv-banelco

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/consultar-tdv-banelco

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/consultar-tdv-banelco

Volver a [Operaciones](#Operaciones).


## habilitacionTarjetas

<details>
<summary>
    Request - habilitacionTarjetasInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "tipotar": "string",
        "tarjeta": "string",
        "tipdoc": "string",
        "nrodoc": "string",
        "numclie": "string",
        "nrooper": "string",
        "canal": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - habilitacionTarjetasOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "cantTarjAdic": "string",
        "nroOper": "string",
        "codMensaje": "string",
        "codigoError": "string",
        "mensajeError": "string",
        "codigoAviso": "string",
        "mensajeAviso": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/habilitacion-tarjetas

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/habilitacion-tarjetas

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/habilitacion-tarjetas

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/habilitacion-tarjetas

Volver a [Operaciones](#Operaciones).


## pedirNrumTdvBanelco

<details>
<summary>
    Request - pedirNrumTdvBanelco
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "cta1": "string",
        "cta10": "string",
        "cta11": "string",
        "cta12": "string",
        "cta13": "string",
        "cta14": "string",
        "cta15": "string",
        "cta16": "string",
        "cta2": "string",
        "cta3": "string",
        "cta4": "string",
        "cta5": "string",
        "cta6": "string",
        "cta7": "string",
        "cta8": "string",
        "cta9": "string",
        "cvv2": "string",
        "nroclie": "string",
        "opcion": "Valor: N / C ",
        "sucur": "string",
        "tarjeta": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - pedirNrumTdvBanelco
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "carcel": "string",
        "carlab": "string",
        "carpar": "string",
        "claiden": "string",
        "clase": "string",
        "codiden": "string",
        "cpostal": "string",
        "cvv2o": "string",
        "depto": "string",
        "direcc": "string",
        "email": "string",
        "estciv": "string",
        "fecalta": "aaaammdd",
        "fecnac": "aaaammdd",
        "fecvenc": "aaaammdd",
        "inddup": "Valor:S/N",
        "localid": "string",
        "miembro": "Valor: 001",
        "nomyape": "string",
        "numcel": "string",
        "numero": "string",
        "numlab": "string",
        "numpar": "string",
        "numtarj": "string",
        "opercel": "string",
        "piso": "string",
        "precel": "string",
        "prelab": "string",
        "prepar": "string",
        "prov": "string",
        "sexo": "Valor: M/F",
        "suctar": "0nnn"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/pedir-nrum-tdv-banelco

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/pedir-nrum-tdv-banelco

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/pedir-nrum-tdv-banelco

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/pedir-nrum-tdv-banelco

Volver a [Operaciones](#Operaciones).


## reimpresionBanking

<details>
<summary>
    Request - reimpresionBankingInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "opcion": "string",
        "tarjeta": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - reimpresionBankingOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },  
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {}
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/reimpresion-banking

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/reimpresion-banking

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/reimpresion-banking

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/reimpresion-banking

Volver a [Operaciones](#Operaciones).


## tarjHabilitacionTotalIvr

<details>
<summary>
    Request - tarjHabilitacionTotalIvrInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "tipotar": "string",
        "tipocli": "string",
        "estado": "string",
        "tipodoc": "string",
        "nrodoc": "string",
        "numclie": "string",
        "funcion": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - tarjHabilitacionTotalIvrOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "mensajeError": "string",
        "mensajeAviso": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarj-habilitacion-total-ivr

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarj-habilitacion-total-ivr

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarj-habilitacion-total-ivr

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/tarj-habilitacion-total-ivr

Volver a [Operaciones](#Operaciones).


## tarjetaBanelcoReimpresion

<details>
<summary>
    Request - tarjetaBanelcoReimpresionInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "nrotarj": "string",
        "opcionj": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - tarjetaBanelcoReimpresionOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "nrotarj": "string",
        "opcionj": "string",
        "nrocta": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarjeta-banelco-reimpresion

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarjeta-banelco-reimpresion

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarjeta-banelco-reimpresion

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/tarjeta-banelco-reimpresion

Volver a [Operaciones](#Operaciones).


## tarjetaCambioNivel

<details>
<summary>
    Request - tarjetaCambioNivelInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "nrotarj": "string",
        "estado": "string",
        "nivel": "string",
        "reimpre": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - tarjetaCambioNivelOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "nrotarj": "string",
        "estado": "string",
        "nivel": "string",
        "reimpre": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarjeta-cambio-nivel

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarjeta-cambio-nivel

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarjeta-cambio-nivel

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/tarjeta-cambio-nivel

Volver a [Operaciones](#Operaciones).


## tarjetaConsultaLimites

<details>
<summary>
    Request - tarjetaConsultaLimitesInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "nrotarj": "string",
        "opcion": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - tarjetaConsultaLimitesOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "nvactl": "string",
        "tarjetaConsultaLimitesGenerals": {
            "tarjetaConsultaLimitesGenerals": [
                {
                    "nivel": "string",
                    "limext": "string",
                    "limcom": "string",
                    "limpes": "string"
                }
            ]
        }
    }
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​​/on-host​/1.1​/tarjeta-consulta-limites

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/tarjeta-consulta-limites

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​​/on-host​/1.1​/tarjeta-consulta-limites

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​​/on-host​/1.1​/tarjeta-consulta-limites

Volver a [Operaciones](#Operaciones).


## validacionTam

<details>
<summary>
    Request - validacionTamInput
</summary>
<p>

```json
{
    "header": {
        "caller": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "channel": "PRE",
        "groupId": "20000000001",
        "password": "xxx",
        "remoteHost": "10.11.12.13",
        "serviceName": "clientData",
        "sessionId": "8a33ff49-64adce33-0164-add58e7b-9876",
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "taskId": "0123456789",
        "userId": "preuser"
    },
    "data": {
        "opcion": "string",
        "canal": "string",
        "cliente": "string",
        "fecha": "string",
        "moneda": "string",
        "importe": "string",
        "respues": "string",
        "observa": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - validacionTamOutput
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    },
    "data": {
        "opcion": "string",
        "canal": "string",
        "cliente": "string",
        "fecha": "string",
        "moneda": "string",
        "importe": "string",
        "respues": "string",
        "observa": "string"
    }
}
```
</p>
</details>

<details>
<summary>
    Response - UnexpectedError
</summary>
<p>

```json
{
    "header": {
        "messageCode": "WC100",
        "messageDescription": "No data found",
        "resultCode": "ok",
        "serviceInstance": {
            "system": "retail",
            "name": "com.midd.test.service.AccountsService",
            "operation": "listAccounts",
            "version": "1.0.4",
            "ip": "10.11.12.13",
            "port": 28080,
            "layer": "service",
            "index": 2,
            "latency": 247
        },
        "transactionId": "8a33ff49-64adce33-0164-add58e7b-0032",
        "errorDetail": [
            {
                "code": "WC100",
                "description": "No data found",
                "id": "accountNumber"
            }
        ]
    }
}
```
</p>
</details>

### URLs

**dev**: https://midd-onhost-1-1-dev.apps.ocp4-tst.intranet.local​/on-host​/1.1​/validacion-tam

**fbd**: https://midd-onhost-1-1-fbd.apps.ocp4-tst.intranet.local​/on-host​/1.1​/validacion-tam

**qat**: https://midd-onhost-1-1-qat.apps.ocp4-tst.intranet.local​/on-host​/1.1​/validacion-tam

**prd**: https://midd-onhost-1-1-prd.apps.ocp4-prd.intranet.local​/on-host​/1.1​/validacion-tam

Volver a [Operaciones](#Operaciones).

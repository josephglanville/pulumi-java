// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.MDATPDataConnectorArgs;
import io.pulumi.azurenative.securityinsights.outputs.AlertsDataTypeOfDataConnectorResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:securityinsights:MDATPDataConnector")
public class MDATPDataConnector extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dataTypes", type=AlertsDataTypeOfDataConnectorResponse.class, parameters={})
    private Output</* @Nullable */ AlertsDataTypeOfDataConnectorResponse> dataTypes;

    public Output</* @Nullable */ AlertsDataTypeOfDataConnectorResponse> getDataTypes() {
        return this.dataTypes;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public MDATPDataConnector(String name, MDATPDataConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:MDATPDataConnector", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private MDATPDataConnector(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:MDATPDataConnector", name, null, makeResourceOptions(options, id));
    }

    private static MDATPDataConnectorArgs makeArgs(MDATPDataConnectorArgs args) {
        var builder = args == null ? MDATPDataConnectorArgs.builder() : MDATPDataConnectorArgs.builder(args);
        return builder
            .setKind("MicrosoftDefenderAdvancedThreatProtection")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:MDATPDataConnector").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20200101:MDATPDataConnector").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:MDATPDataConnector").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:MDATPDataConnector").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static MDATPDataConnector get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MDATPDataConnector(name, id, options);
    }
}

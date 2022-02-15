// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.EntityAnalyticsArgs;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:securityinsights:EntityAnalytics")
public class EntityAnalytics extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
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
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EntityAnalytics(String name, EntityAnalyticsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:EntityAnalytics", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EntityAnalytics(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:EntityAnalytics", name, null, makeResourceOptions(options, id));
    }

    private static EntityAnalyticsArgs makeArgs(EntityAnalyticsArgs args) {
        var builder = args == null ? EntityAnalyticsArgs.builder() : EntityAnalyticsArgs.builder(args);
        return builder
            .setKind("EntityAnalytics")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:EntityAnalytics").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:EntityAnalytics").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:EntityAnalytics").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EntityAnalytics get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EntityAnalytics(name, id, options);
    }
}
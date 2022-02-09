// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.LinkedServiceArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:operationalinsights:LinkedService")
public class LinkedService extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    public Output</* @Nullable */ String> getResourceId() {
        return this.resourceId;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="writeAccessResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> writeAccessResourceId;

    public Output</* @Nullable */ String> getWriteAccessResourceId() {
        return this.writeAccessResourceId;
    }

    public LinkedService(String name, LinkedServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:LinkedService", name, args == null ? LinkedServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LinkedService(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:LinkedService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20151101preview:LinkedService").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20190801preview:LinkedService").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20200301preview:LinkedService").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20200801:LinkedService").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static LinkedService get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LinkedService(name, id, options);
    }
}

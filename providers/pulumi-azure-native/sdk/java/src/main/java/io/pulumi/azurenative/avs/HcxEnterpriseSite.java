// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.HcxEnterpriseSiteArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:avs:HcxEnterpriseSite")
public class HcxEnterpriseSite extends io.pulumi.resources.CustomResource {
    @OutputExport(name="activationKey", type=String.class, parameters={})
    private Output<String> activationKey;

    public Output<String> getActivationKey() {
        return this.activationKey;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public HcxEnterpriseSite(String name, HcxEnterpriseSiteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:HcxEnterpriseSite", name, args == null ? HcxEnterpriseSiteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HcxEnterpriseSite(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:HcxEnterpriseSite", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:avs/v20200320:HcxEnterpriseSite").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20200717preview:HcxEnterpriseSite").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210101preview:HcxEnterpriseSite").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210601:HcxEnterpriseSite").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20211201:HcxEnterpriseSite").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static HcxEnterpriseSite get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HcxEnterpriseSite(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridcompute.MachineExtensionArgs;
import io.pulumi.azurenative.hybridcompute.outputs.MachineExtensionPropertiesResponseInstanceView;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:hybridcompute:MachineExtension")
public class MachineExtension extends io.pulumi.resources.CustomResource {
    @OutputExport(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    public Output</* @Nullable */ Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }
    @OutputExport(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    public Output</* @Nullable */ String> getForceUpdateTag() {
        return this.forceUpdateTag;
    }
    @OutputExport(name="instanceView", type=MachineExtensionPropertiesResponseInstanceView.class, parameters={})
    private Output</* @Nullable */ MachineExtensionPropertiesResponseInstanceView> instanceView;

    public Output</* @Nullable */ MachineExtensionPropertiesResponseInstanceView> getInstanceView() {
        return this.instanceView;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="protectedSettings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> protectedSettings;

    public Output</* @Nullable */ Object> getProtectedSettings() {
        return this.protectedSettings;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="publisher", type=String.class, parameters={})
    private Output</* @Nullable */ String> publisher;

    public Output</* @Nullable */ String> getPublisher() {
        return this.publisher;
    }
    @OutputExport(name="settings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> settings;

    public Output</* @Nullable */ Object> getSettings() {
        return this.settings;
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
    @OutputExport(name="typeHandlerVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeHandlerVersion;

    public Output</* @Nullable */ String> getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public MachineExtension(String name, MachineExtensionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:MachineExtension", name, args == null ? MachineExtensionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MachineExtension(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridcompute:MachineExtension", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20190802preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20191212:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20200730preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20200802:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20200815preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20210128preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20210325preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20210422preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20210517preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20210520:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20210610preview:MachineExtension").build()),
                Input.of(Alias.builder().setType("azure-native:hybridcompute/v20211210preview:MachineExtension").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static MachineExtension get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MachineExtension(name, id, options);
    }
}

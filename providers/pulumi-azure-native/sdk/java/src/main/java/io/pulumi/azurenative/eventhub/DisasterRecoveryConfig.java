// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.DisasterRecoveryConfigArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:eventhub:DisasterRecoveryConfig")
public class DisasterRecoveryConfig extends io.pulumi.resources.CustomResource {
    @OutputExport(name="alternateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> alternateName;

    public Output</* @Nullable */ String> getAlternateName() {
        return this.alternateName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="partnerNamespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerNamespace;

    public Output</* @Nullable */ String> getPartnerNamespace() {
        return this.partnerNamespace;
    }
    @OutputExport(name="pendingReplicationOperationsCount", type=Double.class, parameters={})
    private Output<Double> pendingReplicationOperationsCount;

    public Output<Double> getPendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DisasterRecoveryConfig(String name, DisasterRecoveryConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:DisasterRecoveryConfig", name, args == null ? DisasterRecoveryConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DisasterRecoveryConfig(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:DisasterRecoveryConfig", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:eventhub/v20170401:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20180101preview:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20210101preview:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20210601preview:DisasterRecoveryConfig").build()),
                Input.of(Alias.builder().setType("azure-native:eventhub/v20211101:DisasterRecoveryConfig").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DisasterRecoveryConfig get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DisasterRecoveryConfig(name, id, options);
    }
}

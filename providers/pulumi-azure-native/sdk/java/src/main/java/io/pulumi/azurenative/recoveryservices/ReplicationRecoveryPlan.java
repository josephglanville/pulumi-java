// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ReplicationRecoveryPlanArgs;
import io.pulumi.azurenative.recoveryservices.outputs.RecoveryPlanPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:recoveryservices:ReplicationRecoveryPlan")
public class ReplicationRecoveryPlan extends io.pulumi.resources.CustomResource {
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=RecoveryPlanPropertiesResponse.class, parameters={})
    private Output<RecoveryPlanPropertiesResponse> properties;

    public Output<RecoveryPlanPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ReplicationRecoveryPlan(String name, ReplicationRecoveryPlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationRecoveryPlan", name, args == null ? ReplicationRecoveryPlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ReplicationRecoveryPlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ReplicationRecoveryPlan", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20160810:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20180110:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20180710:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210210:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210301:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210401:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210601:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210701:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210801:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211001:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211101:ReplicationRecoveryPlan").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211201:ReplicationRecoveryPlan").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ReplicationRecoveryPlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationRecoveryPlan(name, id, options);
    }
}

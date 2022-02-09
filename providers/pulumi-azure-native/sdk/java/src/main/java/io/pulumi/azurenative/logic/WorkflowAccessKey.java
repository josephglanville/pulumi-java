// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.WorkflowAccessKeyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:logic:WorkflowAccessKey")
public class WorkflowAccessKey extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="notAfter", type=String.class, parameters={})
    private Output</* @Nullable */ String> notAfter;

    public Output</* @Nullable */ String> getNotAfter() {
        return this.notAfter;
    }
    @OutputExport(name="notBefore", type=String.class, parameters={})
    private Output</* @Nullable */ String> notBefore;

    public Output</* @Nullable */ String> getNotBefore() {
        return this.notBefore;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WorkflowAccessKey(String name, WorkflowAccessKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:WorkflowAccessKey", name, args == null ? WorkflowAccessKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkflowAccessKey(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:logic:WorkflowAccessKey", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:logic/v20150201preview:WorkflowAccessKey").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WorkflowAccessKey get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkflowAccessKey(name, id, options);
    }
}

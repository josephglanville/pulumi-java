// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.PriorityLevelConfigurationArgs;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.PriorityLevelConfigurationSpec;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.PriorityLevelConfigurationStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:flowcontrol.apiserver.k8s.io/v1alpha1:PriorityLevelConfiguration")
public class PriorityLevelConfiguration extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="spec", type=PriorityLevelConfigurationSpec.class, parameters={})
    private Output</* @Nullable */ PriorityLevelConfigurationSpec> spec;

    public Output</* @Nullable */ PriorityLevelConfigurationSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=PriorityLevelConfigurationStatus.class, parameters={})
    private Output</* @Nullable */ PriorityLevelConfigurationStatus> status;

    public Output</* @Nullable */ PriorityLevelConfigurationStatus> getStatus() {
        return this.status;
    }

    public PriorityLevelConfiguration(String name, @Nullable PriorityLevelConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:flowcontrol.apiserver.k8s.io/v1alpha1:PriorityLevelConfiguration", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private PriorityLevelConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:flowcontrol.apiserver.k8s.io/v1alpha1:PriorityLevelConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static PriorityLevelConfigurationArgs makeArgs(@Nullable PriorityLevelConfigurationArgs args) {
        var builder = args == null ? PriorityLevelConfigurationArgs.builder() : PriorityLevelConfigurationArgs.builder(args);
        return builder
            .setApiVersion("flowcontrol.apiserver.k8s.io/v1alpha1")
            .setKind("PriorityLevelConfiguration")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:flowcontrol.apiserver.k8s.io/v1beta1:PriorityLevelConfiguration").build()),
                Input.of(Alias.builder().setType("kubernetes:flowcontrol.apiserver.k8s.io/v1beta2:PriorityLevelConfiguration").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PriorityLevelConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PriorityLevelConfiguration(name, id, options);
    }
}
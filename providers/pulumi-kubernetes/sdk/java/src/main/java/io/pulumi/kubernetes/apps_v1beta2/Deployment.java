// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apps_v1beta2.DeploymentArgs;
import io.pulumi.kubernetes.apps_v1beta2.outputs.DeploymentSpec;
import io.pulumi.kubernetes.apps_v1beta2.outputs.DeploymentStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@Deprecated /* apps/v1beta2/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta2:Deployment")
public class Deployment extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="spec", type=DeploymentSpec.class, parameters={})
    private Output</* @Nullable */ DeploymentSpec> spec;

    public Output</* @Nullable */ DeploymentSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=DeploymentStatus.class, parameters={})
    private Output</* @Nullable */ DeploymentStatus> status;

    public Output</* @Nullable */ DeploymentStatus> getStatus() {
        return this.status;
    }

    public Deployment(String name, @Nullable DeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:Deployment", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private Deployment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:Deployment", name, null, makeResourceOptions(options, id));
    }

    private static DeploymentArgs makeArgs(@Nullable DeploymentArgs args) {
        var builder = args == null ? DeploymentArgs.builder() : DeploymentArgs.builder(args);
        return builder
            .setApiVersion("apps/v1beta2")
            .setKind("Deployment")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:apps/v1:Deployment").build()),
                Input.of(Alias.builder().setType("kubernetes:apps/v1beta1:Deployment").build()),
                Input.of(Alias.builder().setType("kubernetes:extensions/v1beta1:Deployment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Deployment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.SelfSubjectAccessReviewArgs;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.SelfSubjectAccessReviewSpec;
import io.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.SubjectAccessReviewStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:authorization.k8s.io/v1beta1:SelfSubjectAccessReview")
public class SelfSubjectAccessReview extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="spec", type=SelfSubjectAccessReviewSpec.class, parameters={})
    private Output<SelfSubjectAccessReviewSpec> spec;

    public Output<SelfSubjectAccessReviewSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=SubjectAccessReviewStatus.class, parameters={})
    private Output</* @Nullable */ SubjectAccessReviewStatus> status;

    public Output</* @Nullable */ SubjectAccessReviewStatus> getStatus() {
        return this.status;
    }

    public SelfSubjectAccessReview(String name, SelfSubjectAccessReviewArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1beta1:SelfSubjectAccessReview", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private SelfSubjectAccessReview(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authorization.k8s.io/v1beta1:SelfSubjectAccessReview", name, null, makeResourceOptions(options, id));
    }

    private static SelfSubjectAccessReviewArgs makeArgs(SelfSubjectAccessReviewArgs args) {
        var builder = args == null ? SelfSubjectAccessReviewArgs.builder() : SelfSubjectAccessReviewArgs.builder(args);
        return builder
            .setApiVersion("authorization.k8s.io/v1beta1")
            .setKind("SelfSubjectAccessReview")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:authorization.k8s.io/v1:SelfSubjectAccessReview").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SelfSubjectAccessReview get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SelfSubjectAccessReview(name, id, options);
    }
}

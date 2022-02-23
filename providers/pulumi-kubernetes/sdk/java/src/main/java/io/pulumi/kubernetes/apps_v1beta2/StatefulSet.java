// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apps_v1beta2.StatefulSetArgs;
import io.pulumi.kubernetes.apps_v1beta2.outputs.StatefulSetSpec;
import io.pulumi.kubernetes.apps_v1beta2.outputs.StatefulSetStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
 *  - Network: A single stable DNS and hostname.
 *  - Storage: As many VolumeClaims as requested.
 *    The StatefulSet guarantees that a given network identity will always map to the same storage identity.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. The value of 'spec.replicas' matches '.status.replicas', '.status.currentReplicas',
 *    and '.status.readyReplicas'.
 * 2. The value of '.status.updateRevision' matches '.status.currentRevision'.
 * 
 * If the StatefulSet has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the 'customTimeouts' option on the resource.
 * 
 * @deprecated
 * apps/v1beta2/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters.
 * 
 */
@Deprecated /* apps/v1beta2/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
@ResourceType(type="kubernetes:apps/v1beta2:StatefulSet")
public class StatefulSet extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec defines the desired identities of pods in this set.
     * 
     */
    @OutputExport(name="spec", type=StatefulSetSpec.class, parameters={})
    private Output</* @Nullable */ StatefulSetSpec> spec;

    /**
     * @return Spec defines the desired identities of pods in this set.
     * 
     */
    public Output</* @Nullable */ StatefulSetSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
     */
    @OutputExport(name="status", type=StatefulSetStatus.class, parameters={})
    private Output</* @Nullable */ StatefulSetStatus> status;

    /**
     * @return Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
     * 
     */
    public Output</* @Nullable */ StatefulSetStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StatefulSet(String name) {
        this(name, StatefulSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StatefulSet(String name, @Nullable StatefulSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StatefulSet(String name, @Nullable StatefulSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:StatefulSet", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private StatefulSet(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1beta2:StatefulSet", name, null, makeResourceOptions(options, id));
    }

    private static StatefulSetArgs makeArgs(@Nullable StatefulSetArgs args) {
        var builder = args == null ? StatefulSetArgs.builder() : StatefulSetArgs.builder(args);
        return builder
            .setApiVersion("apps/v1beta2")
            .setKind("StatefulSet")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:apps/v1:StatefulSet").build()),
                Input.of(Alias.builder().setType("kubernetes:apps/v1beta1:StatefulSet").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StatefulSet get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StatefulSet(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.panorama.ApplicationInstanceArgs;
import io.pulumi.awsnative.panorama.enums.ApplicationInstanceHealthStatus;
import io.pulumi.awsnative.panorama.enums.ApplicationInstanceStatus;
import io.pulumi.awsnative.panorama.enums.ApplicationInstanceStatusFilter;
import io.pulumi.awsnative.panorama.outputs.ApplicationInstanceManifestOverridesPayload;
import io.pulumi.awsnative.panorama.outputs.ApplicationInstanceManifestPayload;
import io.pulumi.awsnative.panorama.outputs.ApplicationInstanceTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schema for ApplicationInstance CloudFormation Resource
 * 
 */
@ResourceType(type="aws-native:panorama:ApplicationInstance")
public class ApplicationInstance extends io.pulumi.resources.CustomResource {
    @Export(name="applicationInstanceId", type=String.class, parameters={})
    private Output<String> applicationInstanceId;

    public Output<String> getApplicationInstanceId() {
        return this.applicationInstanceId;
    }
    @Export(name="applicationInstanceIdToReplace", type=String.class, parameters={})
    private Output</* @Nullable */ String> applicationInstanceIdToReplace;

    public Output</* @Nullable */ String> getApplicationInstanceIdToReplace() {
        return this.applicationInstanceIdToReplace;
    }
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="createdTime", type=Integer.class, parameters={})
    private Output<Integer> createdTime;

    public Output<Integer> getCreatedTime() {
        return this.createdTime;
    }
    @Export(name="defaultRuntimeContextDevice", type=String.class, parameters={})
    private Output<String> defaultRuntimeContextDevice;

    public Output<String> getDefaultRuntimeContextDevice() {
        return this.defaultRuntimeContextDevice;
    }
    @Export(name="defaultRuntimeContextDeviceName", type=String.class, parameters={})
    private Output<String> defaultRuntimeContextDeviceName;

    public Output<String> getDefaultRuntimeContextDeviceName() {
        return this.defaultRuntimeContextDeviceName;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="deviceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> deviceId;

    public Output</* @Nullable */ String> getDeviceId() {
        return this.deviceId;
    }
    @Export(name="healthStatus", type=ApplicationInstanceHealthStatus.class, parameters={})
    private Output<ApplicationInstanceHealthStatus> healthStatus;

    public Output<ApplicationInstanceHealthStatus> getHealthStatus() {
        return this.healthStatus;
    }
    @Export(name="lastUpdatedTime", type=Integer.class, parameters={})
    private Output<Integer> lastUpdatedTime;

    public Output<Integer> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    @Export(name="manifestOverridesPayload", type=ApplicationInstanceManifestOverridesPayload.class, parameters={})
    private Output</* @Nullable */ ApplicationInstanceManifestOverridesPayload> manifestOverridesPayload;

    public Output</* @Nullable */ ApplicationInstanceManifestOverridesPayload> getManifestOverridesPayload() {
        return this.manifestOverridesPayload;
    }
    @Export(name="manifestPayload", type=ApplicationInstanceManifestPayload.class, parameters={})
    private Output<ApplicationInstanceManifestPayload> manifestPayload;

    public Output<ApplicationInstanceManifestPayload> getManifestPayload() {
        return this.manifestPayload;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @Export(name="runtimeRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeRoleArn;

    public Output</* @Nullable */ String> getRuntimeRoleArn() {
        return this.runtimeRoleArn;
    }
    @Export(name="status", type=ApplicationInstanceStatus.class, parameters={})
    private Output<ApplicationInstanceStatus> status;

    public Output<ApplicationInstanceStatus> getStatus() {
        return this.status;
    }
    @Export(name="statusDescription", type=String.class, parameters={})
    private Output<String> statusDescription;

    public Output<String> getStatusDescription() {
        return this.statusDescription;
    }
    @Export(name="statusFilter", type=ApplicationInstanceStatusFilter.class, parameters={})
    private Output</* @Nullable */ ApplicationInstanceStatusFilter> statusFilter;

    public Output</* @Nullable */ ApplicationInstanceStatusFilter> getStatusFilter() {
        return this.statusFilter;
    }
    @Export(name="tags", type=List.class, parameters={ApplicationInstanceTag.class})
    private Output</* @Nullable */ List<ApplicationInstanceTag>> tags;

    public Output</* @Nullable */ List<ApplicationInstanceTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(ApplicationInstanceArgs.Builder a);
    }
    private static io.pulumi.awsnative.panorama.ApplicationInstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.panorama.ApplicationInstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApplicationInstance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationInstance(String name) {
        this(name, ApplicationInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationInstance(String name, ApplicationInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationInstance(String name, ApplicationInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:ApplicationInstance", name, args == null ? ApplicationInstanceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ApplicationInstance(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:ApplicationInstance", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ApplicationInstance get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationInstance(name, id, options);
    }
}

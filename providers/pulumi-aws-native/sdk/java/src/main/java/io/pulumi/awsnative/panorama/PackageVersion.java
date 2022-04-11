// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.panorama.PackageVersionArgs;
import io.pulumi.awsnative.panorama.enums.PackageVersionStatus;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Schema for PackageVersion Resource Type
 * 
 */
@ResourceType(type="aws-native:panorama:PackageVersion")
public class PackageVersion extends io.pulumi.resources.CustomResource {
    @Export(name="isLatestPatch", type=Boolean.class, parameters={})
    private Output<Boolean> isLatestPatch;

    public Output<Boolean> getIsLatestPatch() {
        return this.isLatestPatch;
    }
    @Export(name="markLatest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> markLatest;

    public Output</* @Nullable */ Boolean> getMarkLatest() {
        return this.markLatest;
    }
    @Export(name="ownerAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerAccount;

    public Output</* @Nullable */ String> getOwnerAccount() {
        return this.ownerAccount;
    }
    @Export(name="packageArn", type=String.class, parameters={})
    private Output<String> packageArn;

    public Output<String> getPackageArn() {
        return this.packageArn;
    }
    @Export(name="packageId", type=String.class, parameters={})
    private Output<String> packageId;

    public Output<String> getPackageId() {
        return this.packageId;
    }
    @Export(name="packageName", type=String.class, parameters={})
    private Output<String> packageName;

    public Output<String> getPackageName() {
        return this.packageName;
    }
    @Export(name="packageVersion", type=String.class, parameters={})
    private Output<String> packageVersion;

    public Output<String> getPackageVersion() {
        return this.packageVersion;
    }
    @Export(name="patchVersion", type=String.class, parameters={})
    private Output<String> patchVersion;

    public Output<String> getPatchVersion() {
        return this.patchVersion;
    }
    @Export(name="registeredTime", type=Integer.class, parameters={})
    private Output<Integer> registeredTime;

    public Output<Integer> getRegisteredTime() {
        return this.registeredTime;
    }
    @Export(name="status", type=PackageVersionStatus.class, parameters={})
    private Output<PackageVersionStatus> status;

    public Output<PackageVersionStatus> getStatus() {
        return this.status;
    }
    @Export(name="statusDescription", type=String.class, parameters={})
    private Output<String> statusDescription;

    public Output<String> getStatusDescription() {
        return this.statusDescription;
    }
    @Export(name="updatedLatestPatchVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> updatedLatestPatchVersion;

    public Output</* @Nullable */ String> getUpdatedLatestPatchVersion() {
        return this.updatedLatestPatchVersion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PackageVersion(String name) {
        this(name, PackageVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PackageVersion(String name, PackageVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PackageVersion(String name, PackageVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:PackageVersion", name, args == null ? PackageVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PackageVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:PackageVersion", name, null, makeResourceOptions(options, id));
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
    public static PackageVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PackageVersion(name, id, options);
    }
}

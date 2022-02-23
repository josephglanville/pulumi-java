// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.location.GeofenceCollectionArgs;
import io.pulumi.awsnative.location.enums.GeofenceCollectionPricingPlan;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Definition of AWS::Location::GeofenceCollection Resource Type
 * 
 */
@ResourceType(type="aws-native:location:GeofenceCollection")
public class GeofenceCollection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="collectionArn", type=String.class, parameters={})
    private Output<String> collectionArn;

    public Output<String> getCollectionArn() {
        return this.collectionArn;
    }
    @OutputExport(name="collectionName", type=String.class, parameters={})
    private Output<String> collectionName;

    public Output<String> getCollectionName() {
        return this.collectionName;
    }
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    @OutputExport(name="pricingPlan", type=GeofenceCollectionPricingPlan.class, parameters={})
    private Output</* @Nullable */ GeofenceCollectionPricingPlan> pricingPlan;

    public Output</* @Nullable */ GeofenceCollectionPricingPlan> getPricingPlan() {
        return this.pricingPlan;
    }
    @OutputExport(name="pricingPlanDataSource", type=String.class, parameters={})
    private Output</* @Nullable */ String> pricingPlanDataSource;

    public Output</* @Nullable */ String> getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GeofenceCollection(String name) {
        this(name, GeofenceCollectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GeofenceCollection(String name, GeofenceCollectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GeofenceCollection(String name, GeofenceCollectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:location:GeofenceCollection", name, args == null ? GeofenceCollectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GeofenceCollection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:location:GeofenceCollection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static GeofenceCollection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GeofenceCollection(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.location;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.location.PlaceIndexArgs;
import io.pulumi.awsnative.location.enums.PlaceIndexPricingPlan;
import io.pulumi.awsnative.location.outputs.PlaceIndexDataSourceConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Definition of AWS::Location::PlaceIndex Resource Type
 * 
 */
@ResourceType(type="aws-native:location:PlaceIndex")
public class PlaceIndex extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @Export(name="dataSource", type=String.class, parameters={})
    private Output<String> dataSource;

    public Output<String> getDataSource() {
        return this.dataSource;
    }
    @Export(name="dataSourceConfiguration", type=PlaceIndexDataSourceConfiguration.class, parameters={})
    private Output</* @Nullable */ PlaceIndexDataSourceConfiguration> dataSourceConfiguration;

    public Output</* @Nullable */ PlaceIndexDataSourceConfiguration> getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @Export(name="indexArn", type=String.class, parameters={})
    private Output<String> indexArn;

    public Output<String> getIndexArn() {
        return this.indexArn;
    }
    @Export(name="indexName", type=String.class, parameters={})
    private Output<String> indexName;

    public Output<String> getIndexName() {
        return this.indexName;
    }
    @Export(name="pricingPlan", type=PlaceIndexPricingPlan.class, parameters={})
    private Output</* @Nullable */ PlaceIndexPricingPlan> pricingPlan;

    public Output</* @Nullable */ PlaceIndexPricingPlan> getPricingPlan() {
        return this.pricingPlan;
    }
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlaceIndex(String name) {
        this(name, PlaceIndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlaceIndex(String name, PlaceIndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlaceIndex(String name, PlaceIndexArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:location:PlaceIndex", name, args == null ? PlaceIndexArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PlaceIndex(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:location:PlaceIndex", name, null, makeResourceOptions(options, id));
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
    public static PlaceIndex get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PlaceIndex(name, id, options);
    }
}

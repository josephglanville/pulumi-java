// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.devicefarm;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.devicefarm.TestGridProjectArgs;
import io.pulumi.awsnative.devicefarm.outputs.TestGridProjectTag;
import io.pulumi.awsnative.devicefarm.outputs.TestGridProjectVpcConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS::DeviceFarm::TestGridProject creates a new TestGrid Project
 * 
 */
@ResourceType(type="aws-native:devicefarm:TestGridProject")
public class TestGridProject extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={TestGridProjectTag.class})
    private Output</* @Nullable */ List<TestGridProjectTag>> tags;

    public Output</* @Nullable */ List<TestGridProjectTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="vpcConfig", type=TestGridProjectVpcConfig.class, parameters={})
    private Output</* @Nullable */ TestGridProjectVpcConfig> vpcConfig;

    public Output</* @Nullable */ TestGridProjectVpcConfig> getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TestGridProject(String name) {
        this(name, TestGridProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TestGridProject(String name, @Nullable TestGridProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TestGridProject(String name, @Nullable TestGridProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:TestGridProject", name, args == null ? TestGridProjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TestGridProject(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:devicefarm:TestGridProject", name, null, makeResourceOptions(options, id));
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
    public static TestGridProject get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TestGridProject(name, id, options);
    }
}

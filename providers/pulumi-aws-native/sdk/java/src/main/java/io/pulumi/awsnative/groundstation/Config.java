// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.groundstation.ConfigArgs;
import io.pulumi.awsnative.groundstation.outputs.ConfigData;
import io.pulumi.awsnative.groundstation.outputs.ConfigTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * AWS Ground Station config resource type for CloudFormation.
 * 
 */
@ResourceType(type="aws-native:groundstation:Config")
public class Config extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="configData", type=ConfigData.class, parameters={})
    private Output<ConfigData> configData;

    public Output<ConfigData> getConfigData() {
        return this.configData;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={ConfigTag.class})
    private Output</* @Nullable */ List<ConfigTag>> tags;

    public Output</* @Nullable */ List<ConfigTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ConfigArgs.Builder a);
    }
    private static io.pulumi.awsnative.groundstation.ConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.groundstation.ConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Config(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Config(String name) {
        this(name, ConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Config(String name, ConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Config(String name, ConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:groundstation:Config", name, args == null ? ConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Config(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:groundstation:Config", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Config get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Config(name, id, options);
    }
}

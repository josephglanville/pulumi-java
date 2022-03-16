// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.memorydb.ParameterGroupArgs;
import io.pulumi.awsnative.memorydb.outputs.ParameterGroupTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::MemoryDB::ParameterGroup resource creates an Amazon MemoryDB ParameterGroup.
 * 
 */
@ResourceType(type="aws-native:memorydb:ParameterGroup")
public class ParameterGroup extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the parameter group.
     * 
     */
    @Export(name="aRN", type=String.class, parameters={})
    private Output<String> aRN;

    /**
     * @return The Amazon Resource Name (ARN) of the parameter group.
     * 
     */
    public Output<String> getARN() {
        return this.aRN;
    }
    /**
     * A description of the parameter group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the parameter group.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the parameter group family that this parameter group is compatible with.
     * 
     */
    @Export(name="family", type=String.class, parameters={})
    private Output<String> family;

    /**
     * @return The name of the parameter group family that this parameter group is compatible with.
     * 
     */
    public Output<String> getFamily() {
        return this.family;
    }
    /**
     * The name of the parameter group.
     * 
     */
    @Export(name="parameterGroupName", type=String.class, parameters={})
    private Output<String> parameterGroupName;

    /**
     * @return The name of the parameter group.
     * 
     */
    public Output<String> getParameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
     * 
     */
    @Export(name="parameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> parameters;

    /**
     * @return An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
     * 
     */
    public Output</* @Nullable */ Object> getParameters() {
        return this.parameters;
    }
    /**
     * An array of key-value pairs to apply to this parameter group.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ParameterGroupTag.class})
    private Output</* @Nullable */ List<ParameterGroupTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this parameter group.
     * 
     */
    public Output</* @Nullable */ List<ParameterGroupTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(ParameterGroupArgs.Builder a);
    }
    private static io.pulumi.awsnative.memorydb.ParameterGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.memorydb.ParameterGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ParameterGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ParameterGroup(String name) {
        this(name, ParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ParameterGroup(String name, ParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ParameterGroup(String name, ParameterGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:ParameterGroup", name, args == null ? ParameterGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ParameterGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:memorydb:ParameterGroup", name, null, makeResourceOptions(options, id));
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
    public static ParameterGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ParameterGroup(name, id, options);
    }
}

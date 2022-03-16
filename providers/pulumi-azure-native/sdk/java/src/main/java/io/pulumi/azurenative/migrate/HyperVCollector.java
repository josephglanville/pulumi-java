// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.HyperVCollectorArgs;
import io.pulumi.azurenative.migrate.outputs.CollectorPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * API Version: 2019-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:migrate:HyperVCollector migrateprojectce73collector /subscriptions/8c3c936a-c09b-4de3-830b-3f5f244d72e9/resourceGroups/contosoithyperv/providers/Microsoft.Migrate/assessmentprojects/migrateprojectce73project/hypervcollectors/migrateprojectce73collector 
 * ```
 * 
 */
@ResourceType(type="azure-native:migrate:HyperVCollector")
public class HyperVCollector extends io.pulumi.resources.CustomResource {
    @Export(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @Export(name="properties", type=CollectorPropertiesResponse.class, parameters={})
    private Output<CollectorPropertiesResponse> properties;

    public Output<CollectorPropertiesResponse> getProperties() {
        return this.properties;
    }
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(HyperVCollectorArgs.Builder a);
    }
    private static io.pulumi.azurenative.migrate.HyperVCollectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.migrate.HyperVCollectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public HyperVCollector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HyperVCollector(String name) {
        this(name, HyperVCollectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HyperVCollector(String name, HyperVCollectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HyperVCollector(String name, HyperVCollectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:HyperVCollector", name, args == null ? HyperVCollectorArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private HyperVCollector(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:HyperVCollector", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:migrate/v20191001:HyperVCollector").build())
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
    public static HyperVCollector get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HyperVCollector(name, id, options);
    }
}

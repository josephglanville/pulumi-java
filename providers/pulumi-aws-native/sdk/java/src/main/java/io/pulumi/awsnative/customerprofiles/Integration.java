// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.customerprofiles.IntegrationArgs;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationFlowDefinition;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationObjectTypeMapping;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The resource schema for creating an Amazon Connect Customer Profiles Integration.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:customerprofiles:Integration")
public class Integration extends io.pulumi.resources.CustomResource {
    /**
     * The time of this integration got created
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time of this integration got created
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The unique name of the domain.
     * 
     */
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The unique name of the domain.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    @OutputExport(name="flowDefinition", type=IntegrationFlowDefinition.class, parameters={})
    private Output</* @Nullable */ IntegrationFlowDefinition> flowDefinition;

    public Output</* @Nullable */ IntegrationFlowDefinition> getFlowDefinition() {
        return this.flowDefinition;
    }
    /**
     * The time of this integration got last updated at
     * 
     */
    @OutputExport(name="lastUpdatedAt", type=String.class, parameters={})
    private Output<String> lastUpdatedAt;

    /**
     * @return The time of this integration got last updated at
     * 
     */
    public Output<String> getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }
    /**
     * The name of the ObjectType defined for the 3rd party data in Profile Service
     * 
     */
    @OutputExport(name="objectTypeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> objectTypeName;

    /**
     * @return The name of the ObjectType defined for the 3rd party data in Profile Service
     * 
     */
    public Output</* @Nullable */ String> getObjectTypeName() {
        return this.objectTypeName;
    }
    /**
     * The mapping between 3rd party event types and ObjectType names
     * 
     */
    @OutputExport(name="objectTypeNames", type=List.class, parameters={IntegrationObjectTypeMapping.class})
    private Output</* @Nullable */ List<IntegrationObjectTypeMapping>> objectTypeNames;

    /**
     * @return The mapping between 3rd party event types and ObjectType names
     * 
     */
    public Output</* @Nullable */ List<IntegrationObjectTypeMapping>> getObjectTypeNames() {
        return this.objectTypeNames;
    }
    /**
     * The tags (keys and values) associated with the integration
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={IntegrationTag.class})
    private Output</* @Nullable */ List<IntegrationTag>> tags;

    /**
     * @return The tags (keys and values) associated with the integration
     * 
     */
    public Output</* @Nullable */ List<IntegrationTag>> getTags() {
        return this.tags;
    }
    /**
     * The URI of the S3 bucket or any other type of data source.
     * 
     */
    @OutputExport(name="uri", type=String.class, parameters={})
    private Output</* @Nullable */ String> uri;

    /**
     * @return The URI of the S3 bucket or any other type of data source.
     * 
     */
    public Output</* @Nullable */ String> getUri() {
        return this.uri;
    }

    public interface BuilderApplicator {
        public void apply(IntegrationArgs.Builder a);
    }
    private static io.pulumi.awsnative.customerprofiles.IntegrationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.customerprofiles.IntegrationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Integration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Integration(String name) {
        this(name, IntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Integration(String name, IntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Integration(String name, IntegrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:customerprofiles:Integration", name, args == null ? IntegrationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Integration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:customerprofiles:Integration", name, null, makeResourceOptions(options, id));
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
    public static Integration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Integration(name, id, options);
    }
}

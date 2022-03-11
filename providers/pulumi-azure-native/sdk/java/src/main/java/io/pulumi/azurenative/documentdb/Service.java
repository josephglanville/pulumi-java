// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.ServiceArgs;
import io.pulumi.azurenative.documentdb.outputs.DataTransferServiceResourcePropertiesResponse;
import io.pulumi.azurenative.documentdb.outputs.SqlDedicatedGatewayServiceResourcePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Properties for the database account.
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:documentdb:Service SqlDedicatedGateway /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.DocumentDB/databaseAccounts/ddb1/services/SqlDedicatedGateway 
 * ```
 * 
 */
@ResourceType(type="azure-native:documentdb:Service")
public class Service extends io.pulumi.resources.CustomResource {
    /**
     * The name of the database account.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the database account.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Services response resource.
     * 
     */
    @OutputExport(name="properties", type=Either.class, parameters={DataTransferServiceResourcePropertiesResponse.class, SqlDedicatedGatewayServiceResourcePropertiesResponse.class})
    private Output<Either<DataTransferServiceResourcePropertiesResponse,SqlDedicatedGatewayServiceResourcePropertiesResponse>> properties;

    /**
     * @return Services response resource.
     * 
     */
    public Output<Either<DataTransferServiceResourcePropertiesResponse,SqlDedicatedGatewayServiceResourcePropertiesResponse>> getProperties() {
        return this.properties;
    }
    /**
     * The type of Azure resource.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Azure resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ServiceArgs.Builder a);
    }
    private static io.pulumi.azurenative.documentdb.ServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.documentdb.ServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Service(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Service(String name) {
        this(name, ServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Service(String name, ServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Service(String name, ServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:Service", name, args == null ? ServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Service(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:documentdb:Service", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210401preview:Service").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20210701preview:Service").build()),
                Output.of(Alias.builder().setType("azure-native:documentdb/v20211015preview:Service").build())
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
    public static Service get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Service(name, id, options);
    }
}

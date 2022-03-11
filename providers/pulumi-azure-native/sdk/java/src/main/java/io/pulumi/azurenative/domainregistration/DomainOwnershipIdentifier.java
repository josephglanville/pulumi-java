// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.domainregistration.DomainOwnershipIdentifierArgs;
import io.pulumi.azurenative.domainregistration.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Domain ownership Identifier.
 * API Version: 2020-10-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:domainregistration:DomainOwnershipIdentifier myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}/domainOwnershipIdentifiers/{name} 
 * ```
 * 
 */
@ResourceType(type="azure-native:domainregistration:DomainOwnershipIdentifier")
public class DomainOwnershipIdentifier extends io.pulumi.resources.CustomResource {
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Ownership Id.
     * 
     */
    @OutputExport(name="ownershipId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownershipId;

    /**
     * @return Ownership Id.
     * 
     */
    public Output</* @Nullable */ String> getOwnershipId() {
        return this.ownershipId;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DomainOwnershipIdentifierArgs.Builder a);
    }
    private static io.pulumi.azurenative.domainregistration.DomainOwnershipIdentifierArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.domainregistration.DomainOwnershipIdentifierArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DomainOwnershipIdentifier(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainOwnershipIdentifier(String name) {
        this(name, DomainOwnershipIdentifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainOwnershipIdentifier(String name, DomainOwnershipIdentifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainOwnershipIdentifier(String name, DomainOwnershipIdentifierArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:domainregistration:DomainOwnershipIdentifier", name, args == null ? DomainOwnershipIdentifierArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DomainOwnershipIdentifier(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:domainregistration:DomainOwnershipIdentifier", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20150401:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20180201:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20190801:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20200601:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20200901:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20201001:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20201201:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20210101:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20210115:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20210201:DomainOwnershipIdentifier").build()),
                Output.of(Alias.builder().setType("azure-native:domainregistration/v20210301:DomainOwnershipIdentifier").build())
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
    public static DomainOwnershipIdentifier get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainOwnershipIdentifier(name, id, options);
    }
}

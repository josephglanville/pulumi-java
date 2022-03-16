// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.StaticSiteCustomDomainArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Static Site Custom Domain Overview ARM resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:StaticSiteCustomDomain myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/staticSites/{name}/customDomains/{domainName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:StaticSiteCustomDomain")
public class StaticSiteCustomDomain extends io.pulumi.resources.CustomResource {
    /**
     * The date and time on which the custom domain was created for the static site.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The date and time on which the custom domain was created for the static site.
     * 
     */
    public Output<String> getCreatedOn() {
        return this.createdOn;
    }
    /**
     * The domain name for the static site custom domain.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The domain name for the static site custom domain.
     * 
     */
    public Output<String> getDomainName() {
        return this.domainName;
    }
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    public Output<String> getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
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
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The status of the custom domain
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the custom domain
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The TXT record validation token
     * 
     */
    @Export(name="validationToken", type=String.class, parameters={})
    private Output<String> validationToken;

    /**
     * @return The TXT record validation token
     * 
     */
    public Output<String> getValidationToken() {
        return this.validationToken;
    }

    public interface BuilderApplicator {
        public void apply(StaticSiteCustomDomainArgs.Builder a);
    }
    private static io.pulumi.azurenative.web.StaticSiteCustomDomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.web.StaticSiteCustomDomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StaticSiteCustomDomain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticSiteCustomDomain(String name) {
        this(name, StaticSiteCustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticSiteCustomDomain(String name, StaticSiteCustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticSiteCustomDomain(String name, StaticSiteCustomDomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteCustomDomain", name, args == null ? StaticSiteCustomDomainArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private StaticSiteCustomDomain(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteCustomDomain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20201201:StaticSiteCustomDomain").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:StaticSiteCustomDomain").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:StaticSiteCustomDomain").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:StaticSiteCustomDomain").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:StaticSiteCustomDomain").build())
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
    public static StaticSiteCustomDomain get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StaticSiteCustomDomain(name, id, options);
    }
}

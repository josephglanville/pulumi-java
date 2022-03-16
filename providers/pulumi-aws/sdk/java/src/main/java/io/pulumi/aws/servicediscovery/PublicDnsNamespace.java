// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicediscovery.PublicDnsNamespaceArgs;
import io.pulumi.aws.servicediscovery.inputs.PublicDnsNamespaceState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Service Discovery Public DNS Namespace resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Service Discovery Public DNS Namespace can be imported using the namespace ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace example 0123456789
 * ```
 * 
 */
@ResourceType(type="aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace")
public class PublicDnsNamespace extends io.pulumi.resources.CustomResource {
    /**
     * The ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The description that you specify for the namespace when you create it.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description that you specify for the namespace when you create it.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * 
     */
    @Export(name="hostedZone", type=String.class, parameters={})
    private Output<String> hostedZone;

    /**
     * @return The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * 
     */
    public Output<String> getHostedZone() {
        return this.hostedZone;
    }
    /**
     * The name of the namespace.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the namespace.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A map of tags to assign to the namespace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the namespace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable PublicDnsNamespaceArgs.Builder a);
    }
    private static io.pulumi.aws.servicediscovery.PublicDnsNamespaceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.servicediscovery.PublicDnsNamespaceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PublicDnsNamespace(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicDnsNamespace(String name) {
        this(name, PublicDnsNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicDnsNamespace(String name, @Nullable PublicDnsNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicDnsNamespace(String name, @Nullable PublicDnsNamespaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace", name, args == null ? PublicDnsNamespaceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PublicDnsNamespace(String name, Output<String> id, @Nullable PublicDnsNamespaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/publicDnsNamespace:PublicDnsNamespace", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PublicDnsNamespace get(String name, Output<String> id, @Nullable PublicDnsNamespaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PublicDnsNamespace(name, id, state, options);
    }
}

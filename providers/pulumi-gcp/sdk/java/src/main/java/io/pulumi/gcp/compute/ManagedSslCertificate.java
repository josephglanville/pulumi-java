// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ManagedSslCertificateArgs;
import io.pulumi.gcp.compute.inputs.ManagedSslCertificateState;
import io.pulumi.gcp.compute.outputs.ManagedSslCertificateManaged;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An SslCertificate resource, used for HTTPS load balancing.  This resource
 * represents a certificate for which the certificate secrets are created and
 * managed by Google.
 * 
 * For a resource where you provide the key, see the
 * SSL Certificate resource.
 * 
 * To get more information about ManagedSslCertificate, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/sslCertificates)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/ssl-certificates)
 * 
 * > **Warning:** This resource should be used with extreme caution!  Provisioning an SSL
 * certificate is complex.  Ensure that you understand the lifecycle of a
 * certificate before attempting complex tasks like cert rotation automatically.
 * This resource will "return" as soon as the certificate object is created,
 * but post-creation the certificate object will go through a "provisioning"
 * process.  The provisioning process can complete only when the domain name
 * for which the certificate is created points to a target pool which, itself,
 * points at the certificate.  Depending on your DNS provider, this may take
 * some time, and migrating from self-managed certificates to Google-managed
 * certificates may entail some downtime while the certificate provisions.
 * 
 * In conclusion: Be extremely cautious.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ManagedSslCertificate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/managedSslCertificate:ManagedSslCertificate default projects/{{project}}/global/sslCertificates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/managedSslCertificate:ManagedSslCertificate default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/managedSslCertificate:ManagedSslCertificate default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/managedSslCertificate:ManagedSslCertificate")
public class ManagedSslCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The unique identifier for the resource.
     * 
     */
    @OutputExport(name="certificateId", type=Integer.class, parameters={})
    private Output<Integer> certificateId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> getCertificateId() {
        return this.certificateId;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Expire time of the certificate.
     * 
     */
    @OutputExport(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return Expire time of the certificate.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * Properties relevant to a managed certificate.  These will be used if the
     * certificate is managed (as indicated by a value of `MANAGED` in `type`).
     * Structure is documented below.
     * 
     */
    @OutputExport(name="managed", type=ManagedSslCertificateManaged.class, parameters={})
    private Output</* @Nullable */ ManagedSslCertificateManaged> managed;

    /**
     * @return Properties relevant to a managed certificate.  These will be used if the
     * certificate is managed (as indicated by a value of `MANAGED` in `type`).
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ ManagedSslCertificateManaged> getManaged() {
        return this.managed;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    @OutputExport(name="subjectAlternativeNames", type=List.class, parameters={String.class})
    private Output<List<String>> subjectAlternativeNames;

    /**
     * @return Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    public Output<List<String>> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }
    /**
     * Enum field whose value is always `MANAGED` - used to signal to the API
     * which type this is.
     * Default value is `MANAGED`.
     * Possible values are `MANAGED`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Enum field whose value is always `MANAGED` - used to signal to the API
     * which type this is.
     * Default value is `MANAGED`.
     * Possible values are `MANAGED`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ManagedSslCertificateArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.ManagedSslCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.ManagedSslCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagedSslCertificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedSslCertificate(String name) {
        this(name, ManagedSslCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedSslCertificate(String name, @Nullable ManagedSslCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedSslCertificate(String name, @Nullable ManagedSslCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/managedSslCertificate:ManagedSslCertificate", name, args == null ? ManagedSslCertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagedSslCertificate(String name, Output<String> id, @Nullable ManagedSslCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/managedSslCertificate:ManagedSslCertificate", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("gcp:compute/mangedSslCertificate:MangedSslCertificate").build())
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ManagedSslCertificate get(String name, Output<String> id, @Nullable ManagedSslCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedSslCertificate(name, id, state, options);
    }
}

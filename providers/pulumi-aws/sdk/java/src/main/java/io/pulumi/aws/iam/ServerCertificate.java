// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.ServerCertificateArgs;
import io.pulumi.aws.iam.inputs.ServerCertificateState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an IAM Server Certificate resource to upload Server Certificates.
 * Certs uploaded to IAM can easily work with other AWS services such as:
 * 
 * - AWS Elastic Beanstalk
 * - Elastic Load Balancing
 * - CloudFront
 * - AWS OpsWorks
 * 
 * For information about server certificates in IAM, see [Managing Server
 * Certificates][2] in AWS Documentation.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM Server Certificates can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/serverCertificate:ServerCertificate certificate example.com-certificate-until-2018
 * ```
 * 
 *  [1]https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html [2]https://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingServerCerts.html [lifecycle]/docs/configuration/resources.html
 * 
 */
@ResourceType(type="aws:iam/serverCertificate:ServerCertificate")
public class ServerCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the server certificate.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the server certificate.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The contents of the public key certificate in
     * PEM-encoded format.
     * 
     */
    @Export(name="certificateBody", type=String.class, parameters={})
    private Output<String> certificateBody;

    /**
     * @return The contents of the public key certificate in
     * PEM-encoded format.
     * 
     */
    public Output<String> getCertificateBody() {
        return this.certificateBody;
    }
    /**
     * The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     * 
     */
    @Export(name="certificateChain", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return The contents of the certificate chain.
     * This is typically a concatenation of the PEM-encoded public key certificates
     * of the chain.
     * 
     */
    public Output</* @Nullable */ String> getCertificateChain() {
        return this.certificateChain;
    }
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
     * 
     */
    @Export(name="expiration", type=String.class, parameters={})
    private Output<String> expiration;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) on which the certificate is set to expire.
     * 
     */
    public Output<String> getExpiration() {
        return this.expiration;
    }
    /**
     * The name of the Server Certificate. Do not include the
     * path in this value. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Server Certificate. Do not include the
     * path in this value. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    /**
     * @return The IAM path for the server certificate.  If it is not
     * included, it defaults to a slash (/). If this certificate is for use with
     * AWS CloudFront, the path must be in format `/cloudfront/your_path_here`.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more details on IAM Paths.
     * 
     */
    public Output</* @Nullable */ String> getPath() {
        return this.path;
    }
    /**
     * The contents of the private key in PEM-encoded format.
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return The contents of the private key in PEM-encoded format.
     * 
     */
    public Output<String> getPrivateKey() {
        return this.privateKey;
    }
    /**
     * Map of resource tags for the server certificate. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags for the server certificate. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
     * 
     */
    @Export(name="uploadDate", type=String.class, parameters={})
    private Output<String> uploadDate;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) when the server certificate was uploaded.
     * 
     */
    public Output<String> getUploadDate() {
        return this.uploadDate;
    }

    public interface BuilderApplicator {
        public void apply(ServerCertificateArgs.Builder a);
    }
    private static io.pulumi.aws.iam.ServerCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iam.ServerCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServerCertificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerCertificate(String name) {
        this(name, ServerCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerCertificate(String name, ServerCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerCertificate(String name, ServerCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/serverCertificate:ServerCertificate", name, args == null ? ServerCertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ServerCertificate(String name, Output<String> id, @Nullable ServerCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/serverCertificate:ServerCertificate", name, state, makeResourceOptions(options, id));
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
    public static ServerCertificate get(String name, Output<String> id, @Nullable ServerCertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerCertificate(name, id, state, options);
    }
}

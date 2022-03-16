// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.appengine_v1.AuthorizedCertificateArgs;
import io.pulumi.googlenative.appengine_v1.outputs.CertificateRawDataResponse;
import io.pulumi.googlenative.appengine_v1.outputs.ManagedCertificateResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Uploads the specified SSL certificate.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:appengine/v1:AuthorizedCertificate")
public class AuthorizedCertificate extends io.pulumi.resources.CustomResource {
    /**
     * The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
     */
    @Export(name="certificateRawData", type=CertificateRawDataResponse.class, parameters={})
    private Output<CertificateRawDataResponse> certificateRawData;

    /**
     * @return The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
     */
    public Output<CertificateRawDataResponse> getCertificateRawData() {
        return this.certificateRawData;
    }
    /**
     * The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Aggregate count of the domain mappings with this certificate mapped. This count includes domain mappings on applications for which the user does not have VIEWER permissions.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
     */
    @Export(name="domainMappingsCount", type=Integer.class, parameters={})
    private Output<Integer> domainMappingsCount;

    /**
     * @return Aggregate count of the domain mappings with this certificate mapped. This count includes domain mappings on applications for which the user does not have VIEWER permissions.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
     */
    public Output<Integer> getDomainMappingsCount() {
        return this.domainMappingsCount;
    }
    /**
     * Topmost applicable domains of this certificate. This certificate applies to these domains and their subdomains. Example: example.com.
     * 
     */
    @Export(name="domainNames", type=List.class, parameters={String.class})
    private Output<List<String>> domainNames;

    /**
     * @return Topmost applicable domains of this certificate. This certificate applies to these domains and their subdomains. Example: example.com.
     * 
     */
    public Output<List<String>> getDomainNames() {
        return this.domainNames;
    }
    /**
     * The time when this certificate expires. To update the renewal time on this certificate, upload an SSL certificate with a different expiration time using AuthorizedCertificates.UpdateAuthorizedCertificate.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return The time when this certificate expires. To update the renewal time on this certificate, upload an SSL certificate with a different expiration time using AuthorizedCertificates.UpdateAuthorizedCertificate.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * Only applicable if this certificate is managed by App Engine. Managed certificates are tied to the lifecycle of a DomainMapping and cannot be updated or deleted via the AuthorizedCertificates API. If this certificate is manually administered by the user, this field will be empty.
     * 
     */
    @Export(name="managedCertificate", type=ManagedCertificateResponse.class, parameters={})
    private Output<ManagedCertificateResponse> managedCertificate;

    /**
     * @return Only applicable if this certificate is managed by App Engine. Managed certificates are tied to the lifecycle of a DomainMapping and cannot be updated or deleted via the AuthorizedCertificates API. If this certificate is manually administered by the user, this field will be empty.
     * 
     */
    public Output<ManagedCertificateResponse> getManagedCertificate() {
        return this.managedCertificate;
    }
    /**
     * Full path to the AuthorizedCertificate resource in the API. Example: apps/myapp/authorizedCertificates/12345.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Full path to the AuthorizedCertificate resource in the API. Example: apps/myapp/authorizedCertificates/12345.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The full paths to user visible Domain Mapping resources that have this certificate mapped. Example: apps/myapp/domainMappings/example.com.This may not represent the full list of mapped domain mappings if the user does not have VIEWER permissions on all of the applications that have this certificate mapped. See domain_mappings_count for a complete count.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
     */
    @Export(name="visibleDomainMappings", type=List.class, parameters={String.class})
    private Output<List<String>> visibleDomainMappings;

    /**
     * @return The full paths to user visible Domain Mapping resources that have this certificate mapped. Example: apps/myapp/domainMappings/example.com.This may not represent the full list of mapped domain mappings if the user does not have VIEWER permissions on all of the applications that have this certificate mapped. See domain_mappings_count for a complete count.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.
     * 
     */
    public Output<List<String>> getVisibleDomainMappings() {
        return this.visibleDomainMappings;
    }

    public interface BuilderApplicator {
        public void apply(AuthorizedCertificateArgs.Builder a);
    }
    private static io.pulumi.googlenative.appengine_v1.AuthorizedCertificateArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.appengine_v1.AuthorizedCertificateArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AuthorizedCertificate(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizedCertificate(String name) {
        this(name, AuthorizedCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizedCertificate(String name, AuthorizedCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizedCertificate(String name, AuthorizedCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:AuthorizedCertificate", name, args == null ? AuthorizedCertificateArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AuthorizedCertificate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:AuthorizedCertificate", name, null, makeResourceOptions(options, id));
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
    public static AuthorizedCertificate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizedCertificate(name, id, options);
    }
}

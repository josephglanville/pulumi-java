// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.CertificateArgs;
import io.pulumi.azurenative.web.outputs.HostingEnvironmentProfileResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * SSL certificate for an app.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:Certificate testc6282 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.Web/certificates/testc6282 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    /**
     * CNAME of the certificate to be issued via free certificate
     * 
     */
    @OutputExport(name="canonicalName", type=String.class, parameters={})
    private Output</* @Nullable */ String> canonicalName;

    /**
     * @return CNAME of the certificate to be issued via free certificate
     * 
     */
    public Output</* @Nullable */ String> getCanonicalName() {
        return this.canonicalName;
    }
    /**
     * Raw bytes of .cer file
     * 
     */
    @OutputExport(name="cerBlob", type=String.class, parameters={})
    private Output<String> cerBlob;

    /**
     * @return Raw bytes of .cer file
     * 
     */
    public Output<String> getCerBlob() {
        return this.cerBlob;
    }
    /**
     * Method of domain validation for free cert
     * 
     */
    @OutputExport(name="domainValidationMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainValidationMethod;

    /**
     * @return Method of domain validation for free cert
     * 
     */
    public Output</* @Nullable */ String> getDomainValidationMethod() {
        return this.domainValidationMethod;
    }
    /**
     * Certificate expiration date.
     * 
     */
    @OutputExport(name="expirationDate", type=String.class, parameters={})
    private Output<String> expirationDate;

    /**
     * @return Certificate expiration date.
     * 
     */
    public Output<String> getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * Friendly name of the certificate.
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return Friendly name of the certificate.
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Host names the certificate applies to.
     * 
     */
    @OutputExport(name="hostNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> hostNames;

    /**
     * @return Host names the certificate applies to.
     * 
     */
    public Output</* @Nullable */ List<String>> getHostNames() {
        return this.hostNames;
    }
    /**
     * Specification for the App Service Environment to use for the certificate.
     * 
     */
    @OutputExport(name="hostingEnvironmentProfile", type=HostingEnvironmentProfileResponse.class, parameters={})
    private Output<HostingEnvironmentProfileResponse> hostingEnvironmentProfile;

    /**
     * @return Specification for the App Service Environment to use for the certificate.
     * 
     */
    public Output<HostingEnvironmentProfileResponse> getHostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }
    /**
     * Certificate issue Date.
     * 
     */
    @OutputExport(name="issueDate", type=String.class, parameters={})
    private Output<String> issueDate;

    /**
     * @return Certificate issue Date.
     * 
     */
    public Output<String> getIssueDate() {
        return this.issueDate;
    }
    /**
     * Certificate issuer.
     * 
     */
    @OutputExport(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    /**
     * @return Certificate issuer.
     * 
     */
    public Output<String> getIssuer() {
        return this.issuer;
    }
    /**
     * Key Vault Csm resource Id.
     * 
     */
    @OutputExport(name="keyVaultId", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultId;

    /**
     * @return Key Vault Csm resource Id.
     * 
     */
    public Output</* @Nullable */ String> getKeyVaultId() {
        return this.keyVaultId;
    }
    /**
     * Key Vault secret name.
     * 
     */
    @OutputExport(name="keyVaultSecretName", type=String.class, parameters={})
    private Output</* @Nullable */ String> keyVaultSecretName;

    /**
     * @return Key Vault secret name.
     * 
     */
    public Output</* @Nullable */ String> getKeyVaultSecretName() {
        return this.keyVaultSecretName;
    }
    /**
     * Status of the Key Vault secret.
     * 
     */
    @OutputExport(name="keyVaultSecretStatus", type=String.class, parameters={})
    private Output<String> keyVaultSecretStatus;

    /**
     * @return Status of the Key Vault secret.
     * 
     */
    public Output<String> getKeyVaultSecretStatus() {
        return this.keyVaultSecretStatus;
    }
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
     * Resource Location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * Pfx blob.
     * 
     */
    @OutputExport(name="pfxBlob", type=String.class, parameters={})
    private Output</* @Nullable */ String> pfxBlob;

    /**
     * @return Pfx blob.
     * 
     */
    public Output</* @Nullable */ String> getPfxBlob() {
        return this.pfxBlob;
    }
    /**
     * Public key hash.
     * 
     */
    @OutputExport(name="publicKeyHash", type=String.class, parameters={})
    private Output<String> publicKeyHash;

    /**
     * @return Public key hash.
     * 
     */
    public Output<String> getPublicKeyHash() {
        return this.publicKeyHash;
    }
    /**
     * Self link.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Self link.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    @OutputExport(name="serverFarmId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverFarmId;

    /**
     * @return Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    public Output</* @Nullable */ String> getServerFarmId() {
        return this.serverFarmId;
    }
    /**
     * App name.
     * 
     */
    @OutputExport(name="siteName", type=String.class, parameters={})
    private Output<String> siteName;

    /**
     * @return App name.
     * 
     */
    public Output<String> getSiteName() {
        return this.siteName;
    }
    /**
     * Subject name of the certificate.
     * 
     */
    @OutputExport(name="subjectName", type=String.class, parameters={})
    private Output<String> subjectName;

    /**
     * @return Subject name of the certificate.
     * 
     */
    public Output<String> getSubjectName() {
        return this.subjectName;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Certificate thumbprint.
     * 
     */
    @OutputExport(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    /**
     * @return Certificate thumbprint.
     * 
     */
    public Output<String> getThumbprint() {
        return this.thumbprint;
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
    /**
     * Is the certificate valid?.
     * 
     */
    @OutputExport(name="valid", type=Boolean.class, parameters={})
    private Output<Boolean> valid;

    /**
     * @return Is the certificate valid?.
     * 
     */
    public Output<Boolean> getValid() {
        return this.valid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Certificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:Certificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160301:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:Certificate").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:Certificate").build())
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
    public static Certificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}

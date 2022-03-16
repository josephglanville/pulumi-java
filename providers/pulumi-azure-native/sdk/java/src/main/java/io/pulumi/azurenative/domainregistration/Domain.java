// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.domainregistration.DomainArgs;
import io.pulumi.azurenative.domainregistration.outputs.HostNameResponse;
import io.pulumi.azurenative.domainregistration.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Information about a domain.
 * API Version: 2020-10-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:domainregistration:Domain myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:domainregistration:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    @Export(name="authCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> authCode;

    public Output</* @Nullable */ String> getAuthCode() {
        return this.authCode;
    }
    /**
     * <code>true</code> if the domain should be automatically renewed; otherwise, <code>false</code>.
     * 
     */
    @Export(name="autoRenew", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return <code>true</code> if the domain should be automatically renewed; otherwise, <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoRenew() {
        return this.autoRenew;
    }
    /**
     * Domain creation timestamp.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return Domain creation timestamp.
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Current DNS type
     * 
     */
    @Export(name="dnsType", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsType;

    /**
     * @return Current DNS type
     * 
     */
    public Output</* @Nullable */ String> getDnsType() {
        return this.dnsType;
    }
    /**
     * Azure DNS Zone to use
     * 
     */
    @Export(name="dnsZoneId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsZoneId;

    /**
     * @return Azure DNS Zone to use
     * 
     */
    public Output</* @Nullable */ String> getDnsZoneId() {
        return this.dnsZoneId;
    }
    /**
     * Reasons why domain is not renewable.
     * 
     */
    @Export(name="domainNotRenewableReasons", type=List.class, parameters={String.class})
    private Output<List<String>> domainNotRenewableReasons;

    /**
     * @return Reasons why domain is not renewable.
     * 
     */
    public Output<List<String>> getDomainNotRenewableReasons() {
        return this.domainNotRenewableReasons;
    }
    /**
     * Domain expiration timestamp.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return Domain expiration timestamp.
     * 
     */
    public Output<String> getExpirationTime() {
        return this.expirationTime;
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
     * Timestamp when the domain was renewed last time.
     * 
     */
    @Export(name="lastRenewedTime", type=String.class, parameters={})
    private Output<String> lastRenewedTime;

    /**
     * @return Timestamp when the domain was renewed last time.
     * 
     */
    public Output<String> getLastRenewedTime() {
        return this.lastRenewedTime;
    }
    /**
     * Resource Location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * All hostnames derived from the domain and assigned to Azure resources.
     * 
     */
    @Export(name="managedHostNames", type=List.class, parameters={HostNameResponse.class})
    private Output<List<HostNameResponse>> managedHostNames;

    /**
     * @return All hostnames derived from the domain and assigned to Azure resources.
     * 
     */
    public Output<List<HostNameResponse>> getManagedHostNames() {
        return this.managedHostNames;
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
     * Name servers.
     * 
     */
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    /**
     * @return Name servers.
     * 
     */
    public Output<List<String>> getNameServers() {
        return this.nameServers;
    }
    /**
     * <code>true</code> if domain privacy is enabled for this domain; otherwise, <code>false</code>.
     * 
     */
    @Export(name="privacy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> privacy;

    /**
     * @return <code>true</code> if domain privacy is enabled for this domain; otherwise, <code>false</code>.
     * 
     */
    public Output</* @Nullable */ Boolean> getPrivacy() {
        return this.privacy;
    }
    /**
     * Domain provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Domain provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * <code>true</code> if Azure can assign this domain to App Service apps; otherwise, <code>false</code>. This value will be <code>true</code> if domain registration status is active and
     *  it is hosted on name servers Azure has programmatic access to.
     * 
     */
    @Export(name="readyForDnsRecordManagement", type=Boolean.class, parameters={})
    private Output<Boolean> readyForDnsRecordManagement;

    /**
     * @return <code>true</code> if Azure can assign this domain to App Service apps; otherwise, <code>false</code>. This value will be <code>true</code> if domain registration status is active and
     *  it is hosted on name servers Azure has programmatic access to.
     * 
     */
    public Output<Boolean> getReadyForDnsRecordManagement() {
        return this.readyForDnsRecordManagement;
    }
    /**
     * Domain registration status.
     * 
     */
    @Export(name="registrationStatus", type=String.class, parameters={})
    private Output<String> registrationStatus;

    /**
     * @return Domain registration status.
     * 
     */
    public Output<String> getRegistrationStatus() {
        return this.registrationStatus;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Target DNS type (would be used for migration)
     * 
     */
    @Export(name="targetDnsType", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetDnsType;

    /**
     * @return Target DNS type (would be used for migration)
     * 
     */
    public Output</* @Nullable */ String> getTargetDnsType() {
        return this.targetDnsType;
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

    public interface BuilderApplicator {
        public void apply(DomainArgs.Builder a);
    }
    private static io.pulumi.azurenative.domainregistration.DomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.domainregistration.DomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Domain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:domainregistration:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:domainregistration:Domain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:domainregistration/v20150401:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20180201:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20190801:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20200601:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20200901:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20201001:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20201201:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20210101:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20210115:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20210201:Domain").build()),
                Output.of(Alias.builder().type("azure-native:domainregistration/v20210301:Domain").build())
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
    public static Domain get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}

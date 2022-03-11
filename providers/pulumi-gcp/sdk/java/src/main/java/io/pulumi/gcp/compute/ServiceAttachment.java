// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ServiceAttachmentArgs;
import io.pulumi.gcp.compute.inputs.ServiceAttachmentState;
import io.pulumi.gcp.compute.outputs.ServiceAttachmentConnectedEndpoint;
import io.pulumi.gcp.compute.outputs.ServiceAttachmentConsumerAcceptList;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a ServiceAttachment resource.
 * 
 * To get more information about ServiceAttachment, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/beta/serviceAttachments)
 * * How-to Guides
 *     * [Configuring Private Service Connect to access services](https://cloud.google.com/vpc/docs/configure-private-service-connect-services)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ServiceAttachment can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/serviceAttachment:ServiceAttachment default projects/{{project}}/regions/{{region}}/serviceAttachments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/serviceAttachment:ServiceAttachment default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/serviceAttachment:ServiceAttachment default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/serviceAttachment:ServiceAttachment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/serviceAttachment:ServiceAttachment")
public class ServiceAttachment extends io.pulumi.resources.CustomResource {
    /**
     * An array of the consumer forwarding rules connected to this service attachment.
     * 
     */
    @OutputExport(name="connectedEndpoints", type=List.class, parameters={ServiceAttachmentConnectedEndpoint.class})
    private Output<List<ServiceAttachmentConnectedEndpoint>> connectedEndpoints;

    /**
     * @return An array of the consumer forwarding rules connected to this service attachment.
     * 
     */
    public Output<List<ServiceAttachmentConnectedEndpoint>> getConnectedEndpoints() {
        return this.connectedEndpoints;
    }
    /**
     * The connection preference to use for this service attachment. Valid
     * values include "ACCEPT_AUTOMATIC", "ACCEPT_MANUAL".
     * 
     */
    @OutputExport(name="connectionPreference", type=String.class, parameters={})
    private Output<String> connectionPreference;

    /**
     * @return The connection preference to use for this service attachment. Valid
     * values include "ACCEPT_AUTOMATIC", "ACCEPT_MANUAL".
     * 
     */
    public Output<String> getConnectionPreference() {
        return this.connectionPreference;
    }
    /**
     * An array of projects that are allowed to connect to this service
     * attachment.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="consumerAcceptLists", type=List.class, parameters={ServiceAttachmentConsumerAcceptList.class})
    private Output</* @Nullable */ List<ServiceAttachmentConsumerAcceptList>> consumerAcceptLists;

    /**
     * @return An array of projects that are allowed to connect to this service
     * attachment.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<ServiceAttachmentConsumerAcceptList>> getConsumerAcceptLists() {
        return this.consumerAcceptLists;
    }
    /**
     * An array of projects that are not allowed to connect to this service
     * attachment.
     * 
     */
    @OutputExport(name="consumerRejectLists", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> consumerRejectLists;

    /**
     * @return An array of projects that are not allowed to connect to this service
     * attachment.
     * 
     */
    public Output</* @Nullable */ List<String>> getConsumerRejectLists() {
        return this.consumerRejectLists;
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
     * If true, enable the proxy protocol which is for supplying client TCP/IP
     * address data in TCP connections that traverse proxies on their way to
     * destination servers.
     * 
     */
    @OutputExport(name="enableProxyProtocol", type=Boolean.class, parameters={})
    private Output<Boolean> enableProxyProtocol;

    /**
     * @return If true, enable the proxy protocol which is for supplying client TCP/IP
     * address data in TCP connections that traverse proxies on their way to
     * destination servers.
     * 
     */
    public Output<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol;
    }
    /**
     * Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. This field is used internally during updates of this resource.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of subnets that is provided for NAT in this service attachment.
     * 
     */
    @OutputExport(name="natSubnets", type=List.class, parameters={String.class})
    private Output<List<String>> natSubnets;

    /**
     * @return An array of subnets that is provided for NAT in this service attachment.
     * 
     */
    public Output<List<String>> getNatSubnets() {
        return this.natSubnets;
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
     * URL of the region where the resource resides.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the resource resides.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
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
     * The URL of a forwarding rule that represents the service identified by
     * this service attachment.
     * 
     */
    @OutputExport(name="targetService", type=String.class, parameters={})
    private Output<String> targetService;

    /**
     * @return The URL of a forwarding rule that represents the service identified by
     * this service attachment.
     * 
     */
    public Output<String> getTargetService() {
        return this.targetService;
    }

    public interface BuilderApplicator {
        public void apply(ServiceAttachmentArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.ServiceAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.ServiceAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServiceAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAttachment(String name) {
        this(name, ServiceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAttachment(String name, ServiceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAttachment(String name, ServiceAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/serviceAttachment:ServiceAttachment", name, args == null ? ServiceAttachmentArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ServiceAttachment(String name, Output<String> id, @Nullable ServiceAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/serviceAttachment:ServiceAttachment", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServiceAttachment get(String name, Output<String> id, @Nullable ServiceAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAttachment(name, id, state, options);
    }
}

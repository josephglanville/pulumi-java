// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.NetworkLoadBalancer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.NetworkLoadBalancer.ListenerArgs;
import com.pulumi.oci.NetworkLoadBalancer.inputs.ListenerState;
import com.pulumi.oci.Utilities;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the Listener resource in Oracle Cloud Infrastructure Network Load Balancer service.
 * 
 * Adds a listener to a network load balancer.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Listeners can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:NetworkLoadBalancer/listener:Listener test_listener &#34;networkLoadBalancers/{networkLoadBalancerId}/listeners/{listenerName}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:NetworkLoadBalancer/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The name of the associated backend set.  Example: `example_backend_set`
     * 
     */
    @Export(name="defaultBackendSetName", type=String.class, parameters={})
    private Output<String> defaultBackendSetName;

    /**
     * @return (Updatable) The name of the associated backend set.  Example: `example_backend_set`
     * 
     */
    public Output<String> defaultBackendSetName() {
        return this.defaultBackendSetName;
    }
    /**
     * (Updatable) IP version associated with the listener.
     * 
     */
    @Export(name="ipVersion", type=String.class, parameters={})
    private Output<String> ipVersion;

    /**
     * @return (Updatable) IP version associated with the listener.
     * 
     */
    public Output<String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * A friendly name for the listener. It must be unique and it cannot be changed.  Example: `example_listener`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name for the listener. It must be unique and it cannot be changed.  Example: `example_listener`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
     * 
     */
    @Export(name="networkLoadBalancerId", type=String.class, parameters={})
    private Output<String> networkLoadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network load balancer to update.
     * 
     */
    public Output<String> networkLoadBalancerId() {
        return this.networkLoadBalancerId;
    }
    /**
     * (Updatable) The communication port for the listener.  Example: `80`
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return (Updatable) The communication port for the listener.  Example: `80`
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * (Updatable) The protocol on which the listener accepts connection requests. For public network load balancers, ANY protocol refers to TCP/UDP. For private network load balancers, ANY protocol refers to TCP/UDP/ICMP (note that ICMP requires isPreserveSourceDestination to be set to true). To get a list of valid protocols, use the [ListNetworkLoadBalancersProtocols](https://docs.cloud.oracle.com/iaas/api/#/en/NetworkLoadBalancer/20200501/networkLoadBalancerProtocol/ListNetworkLoadBalancersProtocols) operation.  Example: `TCP`
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return (Updatable) The protocol on which the listener accepts connection requests. For public network load balancers, ANY protocol refers to TCP/UDP. For private network load balancers, ANY protocol refers to TCP/UDP/ICMP (note that ICMP requires isPreserveSourceDestination to be set to true). To get a list of valid protocols, use the [ListNetworkLoadBalancersProtocols](https://docs.cloud.oracle.com/iaas/api/#/en/NetworkLoadBalancer/20200501/networkLoadBalancerProtocol/ListNetworkLoadBalancersProtocols) operation.  Example: `TCP`
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:NetworkLoadBalancer/listener:Listener", name, args == null ? ListenerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Listener(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:NetworkLoadBalancer/listener:Listener", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Listener get(String name, Output<String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}

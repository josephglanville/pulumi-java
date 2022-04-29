// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.LoadBalancer.SslCipherSuiteArgs;
import com.pulumi.oci.LoadBalancer.inputs.SslCipherSuiteState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource provides the Ssl Cipher Suite resource in Oracle Cloud Infrastructure Load Balancer service.
 * 
 * Creates a custom SSL cipher suite.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SslCipherSuites can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:LoadBalancer/sslCipherSuite:SslCipherSuite test_ssl_cipher_suite &#34;loadBalancers/{loadBalancerId}/sslCipherSuites/{name}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:LoadBalancer/sslCipherSuite:SslCipherSuite")
public class SslCipherSuite extends com.pulumi.resources.CustomResource {
    /**
     * A list of SSL ciphers the load balancer must support for HTTPS or SSL connections.
     * 
     */
    @Export(name="ciphers", type=List.class, parameters={String.class})
    private Output<List<String>> ciphers;

    /**
     * @return A list of SSL ciphers the load balancer must support for HTTPS or SSL connections.
     * 
     */
    public Output<List<String>> ciphers() {
        return this.ciphers;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated load balancer.
     * 
     */
    @Export(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated load balancer.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * A friendly name for the SSL cipher suite. It must be unique and it cannot be changed.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name for the SSL cipher suite. It must be unique and it cannot be changed.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SslCipherSuite(String name) {
        this(name, SslCipherSuiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SslCipherSuite(String name, SslCipherSuiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SslCipherSuite(String name, SslCipherSuiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:LoadBalancer/sslCipherSuite:SslCipherSuite", name, args == null ? SslCipherSuiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SslCipherSuite(String name, Output<String> id, @Nullable SslCipherSuiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:LoadBalancer/sslCipherSuite:SslCipherSuite", name, state, makeResourceOptions(options, id));
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
    public static SslCipherSuite get(String name, Output<String> id, @Nullable SslCipherSuiteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SslCipherSuite(name, id, state, options);
    }
}

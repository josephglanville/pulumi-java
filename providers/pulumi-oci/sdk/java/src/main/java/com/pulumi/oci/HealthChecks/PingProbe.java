// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.HealthChecks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.HealthChecks.PingProbeArgs;
import com.pulumi.oci.HealthChecks.inputs.PingProbeState;
import com.pulumi.oci.Utilities;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource provides the Ping Probe resource in Oracle Cloud Infrastructure Health Checks service.
 * 
 * Creates an on-demand ping probe. The location response header contains the URL for
 * fetching probe results.
 * 
 * *Note:* The on-demand probe configuration is not saved.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * PingProbes can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:HealthChecks/pingProbe:PingProbe test_ping_probe &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:HealthChecks/pingProbe:PingProbe")
public class PingProbe extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the compartment.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The region where updates must be made and where results must be fetched from.
     * 
     */
    @Export(name="homeRegion", type=String.class, parameters={})
    private Output<String> homeRegion;

    /**
     * @return The region where updates must be made and where results must be fetched from.
     * 
     */
    public Output<String> homeRegion() {
        return this.homeRegion;
    }
    /**
     * The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The protocols for ping probes.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocols for ping probes.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * A URL for fetching the probe results.
     * 
     */
    @Export(name="resultsUrl", type=String.class, parameters={})
    private Output<String> resultsUrl;

    /**
     * @return A URL for fetching the probe results.
     * 
     */
    public Output<String> resultsUrl() {
        return this.resultsUrl;
    }
    /**
     * A list of targets (hostnames or IP addresses) of the probe.
     * 
     */
    @Export(name="targets", type=List.class, parameters={String.class})
    private Output<List<String>> targets;

    /**
     * @return A list of targets (hostnames or IP addresses) of the probe.
     * 
     */
    public Output<List<String>> targets() {
        return this.targets;
    }
    /**
     * The RFC 3339-formatted creation date and time of the probe.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The RFC 3339-formatted creation date and time of the probe.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
     * 
     */
    @Export(name="timeoutInSeconds", type=Integer.class, parameters={})
    private Output<Integer> timeoutInSeconds;

    /**
     * @return The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
     * 
     */
    public Output<Integer> timeoutInSeconds() {
        return this.timeoutInSeconds;
    }
    /**
     * A list of names of vantage points from which to execute the probe.
     * 
     */
    @Export(name="vantagePointNames", type=List.class, parameters={String.class})
    private Output<List<String>> vantagePointNames;

    /**
     * @return A list of names of vantage points from which to execute the probe.
     * 
     */
    public Output<List<String>> vantagePointNames() {
        return this.vantagePointNames;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PingProbe(String name) {
        this(name, PingProbeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PingProbe(String name, PingProbeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PingProbe(String name, PingProbeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:HealthChecks/pingProbe:PingProbe", name, args == null ? PingProbeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PingProbe(String name, Output<String> id, @Nullable PingProbeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:HealthChecks/pingProbe:PingProbe", name, state, makeResourceOptions(options, id));
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
    public static PingProbe get(String name, Output<String> id, @Nullable PingProbeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PingProbe(name, id, state, options);
    }
}

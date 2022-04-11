// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.HealthCheckArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckState;
import io.pulumi.gcp.compute.outputs.HealthCheckGrpcHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckHttp2HealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckHttpHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckHttpsHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckLogConfig;
import io.pulumi.gcp.compute.outputs.HealthCheckSslHealthCheck;
import io.pulumi.gcp.compute.outputs.HealthCheckTcpHealthCheck;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Health Checks determine whether instances are responsive and able to do work.
 * They are an important part of a comprehensive load balancing configuration,
 * as they enable monitoring instances behind load balancers.
 * 
 * Health Checks poll instances at a specified interval. Instances that
 * do not respond successfully to some number of probes in a row are marked
 * as unhealthy. No new connections are sent to unhealthy instances,
 * though existing connections will continue. The health check will
 * continue to poll unhealthy instances. If an instance later responds
 * successfully to some number of consecutive probes, it is marked
 * healthy again and can receive new connections.
 * 
 * ~>**NOTE**: Legacy HTTP(S) health checks must be used for target pool-based network
 * load balancers. See the [official guide](https://cloud.google.com/load-balancing/docs/health-check-concepts#selecting_hc)
 * for choosing a type of health check.
 * 
 * To get more information about HealthCheck, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/healthChecks)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/health-checks)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * HealthCheck can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/healthCheck:HealthCheck default projects/{{project}}/global/healthChecks/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/healthCheck:HealthCheck default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/healthCheck:HealthCheck default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/healthCheck:HealthCheck")
public class HealthCheck extends io.pulumi.resources.CustomResource {
    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    @Export(name="checkIntervalSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> checkIntervalSec;

    /**
     * @return How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getCheckIntervalSec() {
        return this.checkIntervalSec;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="grpcHealthCheck", type=HealthCheckGrpcHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckGrpcHealthCheck> grpcHealthCheck;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ HealthCheckGrpcHealthCheck> getGrpcHealthCheck() {
        return this.grpcHealthCheck;
    }
    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    @Export(name="healthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthyThreshold;

    /**
     * @return A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    public Output</* @Nullable */ Integer> getHealthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="http2HealthCheck", type=HealthCheckHttp2HealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckHttp2HealthCheck> http2HealthCheck;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ HealthCheckHttp2HealthCheck> getHttp2HealthCheck() {
        return this.http2HealthCheck;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="httpHealthCheck", type=HealthCheckHttpHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckHttpHealthCheck> httpHealthCheck;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ HealthCheckHttpHealthCheck> getHttpHealthCheck() {
        return this.httpHealthCheck;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="httpsHealthCheck", type=HealthCheckHttpsHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckHttpsHealthCheck> httpsHealthCheck;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ HealthCheckHttpsHealthCheck> getHttpsHealthCheck() {
        return this.httpsHealthCheck;
    }
    /**
     * Configure logging on this health check.
     * Structure is documented below.
     * 
     */
    @Export(name="logConfig", type=HealthCheckLogConfig.class, parameters={})
    private Output<HealthCheckLogConfig> logConfig;

    /**
     * @return Configure logging on this health check.
     * Structure is documented below.
     * 
     */
    public Output<HealthCheckLogConfig> getLogConfig() {
        return this.logConfig;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
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
    @Export(name="project", type=String.class, parameters={})
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
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="sslHealthCheck", type=HealthCheckSslHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckSslHealthCheck> sslHealthCheck;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ HealthCheckSslHealthCheck> getSslHealthCheck() {
        return this.sslHealthCheck;
    }
    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Export(name="tcpHealthCheck", type=HealthCheckTcpHealthCheck.class, parameters={})
    private Output</* @Nullable */ HealthCheckTcpHealthCheck> tcpHealthCheck;

    /**
     * @return A nested object resource
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ HealthCheckTcpHealthCheck> getTcpHealthCheck() {
        return this.tcpHealthCheck;
    }
    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    @Export(name="timeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutSec;

    /**
     * @return How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    public Output</* @Nullable */ Integer> getTimeoutSec() {
        return this.timeoutSec;
    }
    /**
     * The type of the health check. One of HTTP, HTTPS, TCP, or SSL.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the health check. One of HTTP, HTTPS, TCP, or SSL.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    @Export(name="unhealthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> unhealthyThreshold;

    /**
     * @return A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    public Output</* @Nullable */ Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HealthCheck(String name) {
        this(name, HealthCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HealthCheck(String name, @Nullable HealthCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HealthCheck(String name, @Nullable HealthCheckArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/healthCheck:HealthCheck", name, args == null ? HealthCheckArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HealthCheck(String name, Output<String> id, @Nullable HealthCheckState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/healthCheck:HealthCheck", name, state, makeResourceOptions(options, id));
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
    public static HealthCheck get(String name, Output<String> id, @Nullable HealthCheckState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HealthCheck(name, id, state, options);
    }
}

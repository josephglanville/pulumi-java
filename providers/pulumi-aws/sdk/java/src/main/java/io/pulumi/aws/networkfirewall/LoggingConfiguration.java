// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.networkfirewall.LoggingConfigurationArgs;
import io.pulumi.aws.networkfirewall.inputs.LoggingConfigurationState;
import io.pulumi.aws.networkfirewall.outputs.LoggingConfigurationLoggingConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AWS Network Firewall Logging Configuration Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Network Firewall Logging Configurations can be imported using the `firewall_arn` e.g
 * 
 * ```sh
 *  $ pulumi import aws:networkfirewall/loggingConfiguration:LoggingConfiguration example arn:aws:network-firewall:us-west-1:123456789012:firewall/example
 * ```
 * 
 */
@ResourceType(type="aws:networkfirewall/loggingConfiguration:LoggingConfiguration")
public class LoggingConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Network Firewall firewall.
     * 
     */
    @Export(name="firewallArn", type=String.class, parameters={})
    private Output<String> firewallArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Network Firewall firewall.
     * 
     */
    public Output<String> getFirewallArn() {
        return this.firewallArn;
    }
    /**
     * A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * 
     */
    @Export(name="loggingConfiguration", type=LoggingConfigurationLoggingConfiguration.class, parameters={})
    private Output<LoggingConfigurationLoggingConfiguration> loggingConfiguration;

    /**
     * @return A configuration block describing how AWS Network Firewall performs logging for a firewall. See Logging Configuration below for details.
     * 
     */
    public Output<LoggingConfigurationLoggingConfiguration> getLoggingConfiguration() {
        return this.loggingConfiguration;
    }

    public interface BuilderApplicator {
        public void apply(LoggingConfigurationArgs.Builder a);
    }
    private static io.pulumi.aws.networkfirewall.LoggingConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.networkfirewall.LoggingConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LoggingConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoggingConfiguration(String name) {
        this(name, LoggingConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoggingConfiguration(String name, LoggingConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoggingConfiguration(String name, LoggingConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/loggingConfiguration:LoggingConfiguration", name, args == null ? LoggingConfigurationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LoggingConfiguration(String name, Output<String> id, @Nullable LoggingConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkfirewall/loggingConfiguration:LoggingConfiguration", name, state, makeResourceOptions(options, id));
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
    public static LoggingConfiguration get(String name, Output<String> id, @Nullable LoggingConfigurationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoggingConfiguration(name, id, state, options);
    }
}

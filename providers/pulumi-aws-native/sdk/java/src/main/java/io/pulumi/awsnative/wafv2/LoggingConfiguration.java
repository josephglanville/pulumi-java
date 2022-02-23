// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wafv2.LoggingConfigurationArgs;
import io.pulumi.awsnative.wafv2.outputs.LoggingConfigurationFieldToMatch;
import io.pulumi.awsnative.wafv2.outputs.LoggingFilterProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A WAFv2 Logging Configuration Resource Provider
 * 
 */
@ResourceType(type="aws-native:wafv2:LoggingConfiguration")
public class LoggingConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Names (ARNs) of the logging destinations that you want to associate with the web ACL.
     * 
     */
    @OutputExport(name="logDestinationConfigs", type=List.class, parameters={String.class})
    private Output<List<String>> logDestinationConfigs;

    /**
     * @return The Amazon Resource Names (ARNs) of the logging destinations that you want to associate with the web ACL.
     * 
     */
    public Output<List<String>> getLogDestinationConfigs() {
        return this.logDestinationConfigs;
    }
    /**
     * Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * 
     */
    @OutputExport(name="loggingFilter", type=LoggingFilterProperties.class, parameters={})
    private Output</* @Nullable */ LoggingFilterProperties> loggingFilter;

    /**
     * @return Filtering that specifies which web requests are kept in the logs and which are dropped. You can filter on the rule action and on the web request labels that were applied by matching rules during web ACL evaluation.
     * 
     */
    public Output</* @Nullable */ LoggingFilterProperties> getLoggingFilter() {
        return this.loggingFilter;
    }
    /**
     * Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     * 
     */
    @OutputExport(name="managedByFirewallManager", type=Boolean.class, parameters={})
    private Output<Boolean> managedByFirewallManager;

    /**
     * @return Indicates whether the logging configuration was created by AWS Firewall Manager, as part of an AWS WAF policy configuration. If true, only Firewall Manager can modify or delete the configuration.
     * 
     */
    public Output<Boolean> getManagedByFirewallManager() {
        return this.managedByFirewallManager;
    }
    /**
     * The parts of the request that you want to keep out of the logs. For example, if you redact the HEADER field, the HEADER field in the firehose will be xxx.
     * 
     */
    @OutputExport(name="redactedFields", type=List.class, parameters={LoggingConfigurationFieldToMatch.class})
    private Output</* @Nullable */ List<LoggingConfigurationFieldToMatch>> redactedFields;

    /**
     * @return The parts of the request that you want to keep out of the logs. For example, if you redact the HEADER field, the HEADER field in the firehose will be xxx.
     * 
     */
    public Output</* @Nullable */ List<LoggingConfigurationFieldToMatch>> getRedactedFields() {
        return this.redactedFields;
    }
    /**
     * The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
     * 
     */
    @OutputExport(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the web ACL that you want to associate with LogDestinationConfigs.
     * 
     */
    public Output<String> getResourceArn() {
        return this.resourceArn;
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
        super("aws-native:wafv2:LoggingConfiguration", name, args == null ? LoggingConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LoggingConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:wafv2:LoggingConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LoggingConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LoggingConfiguration(name, id, options);
    }
}

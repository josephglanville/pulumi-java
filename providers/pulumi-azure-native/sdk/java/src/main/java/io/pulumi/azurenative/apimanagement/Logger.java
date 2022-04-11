// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.LoggerArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Logger details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:apimanagement:Logger eh1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ApiManagement/service/apimService1/loggers/eh1 
 * ```
 * 
 */
@ResourceType(type="azure-native:apimanagement:Logger")
public class Logger extends io.pulumi.resources.CustomResource {
    /**
     * The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     * 
     */
    @Export(name="credentials", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> credentials;

    /**
     * @return The name and SendRule connection string of the event hub for azureEventHub logger.
     * Instrumentation key for applicationInsights logger.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getCredentials() {
        return this.credentials;
    }
    /**
     * Logger description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Logger description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether records are buffered in the logger before publishing. Default is assumed to be true.
     * 
     */
    @Export(name="isBuffered", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isBuffered;

    /**
     * @return Whether records are buffered in the logger before publishing. Default is assumed to be true.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsBuffered() {
        return this.isBuffered;
    }
    /**
     * Logger type.
     * 
     */
    @Export(name="loggerType", type=String.class, parameters={})
    private Output<String> loggerType;

    /**
     * @return Logger type.
     * 
     */
    public Output<String> getLoggerType() {
        return this.loggerType;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Azure Resource Id of a log target (either Azure Event Hub resource or Azure Application Insights resource).
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceId;

    /**
     * @return Azure Resource Id of a log target (either Azure Event Hub resource or Azure Application Insights resource).
     * 
     */
    public Output</* @Nullable */ String> getResourceId() {
        return this.resourceId;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type for API Management resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Logger(String name) {
        this(name, LoggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Logger(String name, LoggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Logger(String name, LoggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Logger", name, args == null ? LoggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Logger(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Logger", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:apimanagement/v20160707:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20161010:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20170301:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180101:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20180601preview:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20190101:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20191201preview:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20200601preview:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20201201:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210101preview:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210401preview:Logger").build()),
                Output.of(Alias.builder().type("azure-native:apimanagement/v20210801:Logger").build())
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
    public static Logger get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Logger(name, id, options);
    }
}

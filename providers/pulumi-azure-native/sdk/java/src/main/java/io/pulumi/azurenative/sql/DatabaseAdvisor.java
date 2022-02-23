// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.DatabaseAdvisorArgs;
import io.pulumi.azurenative.sql.outputs.RecommendedActionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Database, Server or Elastic Pool Advisor.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:DatabaseAdvisor CreateIndex /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/workloadinsight-demos/providers/Microsoft.Sql/servers/misosisvr/databases/IndexAdvisor_test_3/advisors/CreateIndex 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:DatabaseAdvisor")
public class DatabaseAdvisor extends io.pulumi.resources.CustomResource {
    /**
     * Gets the status of availability of this advisor to customers. Possible values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'.
     * 
     */
    @OutputExport(name="advisorStatus", type=String.class, parameters={})
    private Output<String> advisorStatus;

    /**
     * @return Gets the status of availability of this advisor to customers. Possible values are 'GA', 'PublicPreview', 'LimitedPublicPreview' and 'PrivatePreview'.
     * 
     */
    public Output<String> getAdvisorStatus() {
        return this.advisorStatus;
    }
    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'
     * 
     */
    @OutputExport(name="autoExecuteStatus", type=String.class, parameters={})
    private Output<String> autoExecuteStatus;

    /**
     * @return Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'
     * 
     */
    public Output<String> getAutoExecuteStatus() {
        return this.autoExecuteStatus;
    }
    /**
     * Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when status is not explicitly set on any level).
     * 
     */
    @OutputExport(name="autoExecuteStatusInheritedFrom", type=String.class, parameters={})
    private Output<String> autoExecuteStatusInheritedFrom;

    /**
     * @return Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are 'Subscription', 'Server', 'ElasticPool', 'Database' and 'Default' (when status is not explicitly set on any level).
     * 
     */
    public Output<String> getAutoExecuteStatusInheritedFrom() {
        return this.autoExecuteStatusInheritedFrom;
    }
    /**
     * Resource kind.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Resource kind.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
     */
    @OutputExport(name="lastChecked", type=String.class, parameters={})
    private Output<String> lastChecked;

    /**
     * @return Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
     */
    public Output<String> getLastChecked() {
        return this.lastChecked;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations available),LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     * 
     */
    @OutputExport(name="recommendationsStatus", type=String.class, parameters={})
    private Output<String> recommendationsStatus;

    /**
     * @return Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, 'Ok' (Recommendations available),LowActivity (not enough workload to analyze), 'DbSeemsTuned' (Database is doing well), etc.
     * 
     */
    public Output<String> getRecommendationsStatus() {
        return this.recommendationsStatus;
    }
    /**
     * Gets the recommended actions for this advisor.
     * 
     */
    @OutputExport(name="recommendedActions", type=List.class, parameters={RecommendedActionResponse.class})
    private Output<List<RecommendedActionResponse>> recommendedActions;

    /**
     * @return Gets the recommended actions for this advisor.
     * 
     */
    public Output<List<RecommendedActionResponse>> getRecommendedActions() {
        return this.recommendedActions;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseAdvisor(String name) {
        this(name, DatabaseAdvisorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseAdvisor(String name, DatabaseAdvisorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseAdvisor(String name, DatabaseAdvisorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DatabaseAdvisor", name, args == null ? DatabaseAdvisorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatabaseAdvisor(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DatabaseAdvisor", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20140401:DatabaseAdvisor").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20150501preview:DatabaseAdvisor").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:DatabaseAdvisor").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:DatabaseAdvisor").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:DatabaseAdvisor").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:DatabaseAdvisor").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:DatabaseAdvisor").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:DatabaseAdvisor").build())
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
    public static DatabaseAdvisor get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseAdvisor(name, id, options);
    }
}

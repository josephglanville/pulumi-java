// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.LongTermRetentionPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A long term retention policy.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:LongTermRetentionPolicy default /subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Sql/resourceGroups/resourceGroup/servers/testserver/databases/testDatabase/backupLongTermRetentionPolicies/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:LongTermRetentionPolicy")
public class LongTermRetentionPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    @OutputExport(name="monthlyRetention", type=String.class, parameters={})
    private Output</* @Nullable */ String> monthlyRetention;

    /**
     * @return The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    public Output</* @Nullable */ String> getMonthlyRetention() {
        return this.monthlyRetention;
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
     * The week of year to take the yearly backup in an ISO 8601 format.
     * 
     */
    @OutputExport(name="weekOfYear", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> weekOfYear;

    /**
     * @return The week of year to take the yearly backup in an ISO 8601 format.
     * 
     */
    public Output</* @Nullable */ Integer> getWeekOfYear() {
        return this.weekOfYear;
    }
    /**
     * The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    @OutputExport(name="weeklyRetention", type=String.class, parameters={})
    private Output</* @Nullable */ String> weeklyRetention;

    /**
     * @return The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    public Output</* @Nullable */ String> getWeeklyRetention() {
        return this.weeklyRetention;
    }
    /**
     * The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    @OutputExport(name="yearlyRetention", type=String.class, parameters={})
    private Output</* @Nullable */ String> yearlyRetention;

    /**
     * @return The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    public Output</* @Nullable */ String> getYearlyRetention() {
        return this.yearlyRetention;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LongTermRetentionPolicy(String name) {
        this(name, LongTermRetentionPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LongTermRetentionPolicy(String name, LongTermRetentionPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LongTermRetentionPolicy(String name, LongTermRetentionPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:LongTermRetentionPolicy", name, args == null ? LongTermRetentionPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LongTermRetentionPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:LongTermRetentionPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20170301preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:LongTermRetentionPolicy").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:LongTermRetentionPolicy").build())
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
    public static LongTermRetentionPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LongTermRetentionPolicy(name, id, options);
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.confidentialledger.LedgerArgs;
import io.pulumi.azurenative.confidentialledger.outputs.LedgerPropertiesResponse;
import io.pulumi.azurenative.confidentialledger.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Confidential Ledger. Contains the properties of Confidential Ledger Resource.
 * API Version: 2020-12-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:confidentialledger:Ledger DummyLedgerName /subscriptions/00000000-0000-0000-0000-000000000001/resourceGroups/TestRG/providers/Microsoft.ConfidentialLedger/ledgers/DummyLedgerName 
 * ```
 * 
 */
@ResourceType(type="azure-native:confidentialledger:Ledger")
public class Ledger extends io.pulumi.resources.CustomResource {
    /**
     * The Azure location where the Confidential Ledger is running.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The Azure location where the Confidential Ledger is running.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Name of the Resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of Confidential Ledger Resource.
     * 
     */
    @Export(name="properties", type=LedgerPropertiesResponse.class, parameters={})
    private Output<LedgerPropertiesResponse> properties;

    /**
     * @return Properties of Confidential Ledger Resource.
     * 
     */
    public Output<LedgerPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Additional tags for Confidential Ledger
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Additional tags for Confidential Ledger
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(LedgerArgs.Builder a);
    }
    private static io.pulumi.azurenative.confidentialledger.LedgerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.confidentialledger.LedgerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Ledger(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ledger(String name) {
        this(name, LedgerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ledger(String name, LedgerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ledger(String name, LedgerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:confidentialledger:Ledger", name, args == null ? LedgerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Ledger(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:confidentialledger:Ledger", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:confidentialledger/v20201201preview:Ledger").build()),
                Output.of(Alias.builder().type("azure-native:confidentialledger/v20210513preview:Ledger").build())
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
    public static Ledger get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Ledger(name, id, options);
    }
}

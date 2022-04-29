// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Marketplace.ListingPackageAgreementArgs;
import com.pulumi.oci.Marketplace.inputs.ListingPackageAgreementState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides details about a specific Listing Package Agreement resource in Oracle Cloud Infrastructure Marketplace service.
 * 
 * This resource can be used to retrieve the time-based signature of terms of use agreement for a package that can be used to
 * accept the agreement.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Import is not supported for this resource.
 * 
 */
@ResourceType(type="oci:Marketplace/listingPackageAgreement:ListingPackageAgreement")
public class ListingPackageAgreement extends com.pulumi.resources.CustomResource {
    /**
     * The unique identifier for the agreement.
     * 
     */
    @Export(name="agreementId", type=String.class, parameters={})
    private Output<String> agreementId;

    /**
     * @return The unique identifier for the agreement.
     * 
     */
    public Output<String> agreementId() {
        return this.agreementId;
    }
    /**
     * Who authored the agreement.
     * 
     */
    @Export(name="author", type=String.class, parameters={})
    private Output<String> author;

    /**
     * @return Who authored the agreement.
     * 
     */
    public Output<String> author() {
        return this.author;
    }
    /**
     * The unique identifier for the compartment, required in gov regions.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return The unique identifier for the compartment, required in gov regions.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The content URL of the agreement.
     * 
     */
    @Export(name="contentUrl", type=String.class, parameters={})
    private Output<String> contentUrl;

    /**
     * @return The content URL of the agreement.
     * 
     */
    public Output<String> contentUrl() {
        return this.contentUrl;
    }
    /**
     * The unique identifier for the listing.
     * 
     */
    @Export(name="listingId", type=String.class, parameters={})
    private Output<String> listingId;

    /**
     * @return The unique identifier for the listing.
     * 
     */
    public Output<String> listingId() {
        return this.listingId;
    }
    /**
     * The version of the package. Package versions are unique within a listing.
     * 
     */
    @Export(name="packageVersion", type=String.class, parameters={})
    private Output<String> packageVersion;

    /**
     * @return The version of the package. Package versions are unique within a listing.
     * 
     */
    public Output<String> packageVersion() {
        return this.packageVersion;
    }
    /**
     * Textual prompt to read and accept the agreement.
     * 
     */
    @Export(name="prompt", type=String.class, parameters={})
    private Output<String> prompt;

    /**
     * @return Textual prompt to read and accept the agreement.
     * 
     */
    public Output<String> prompt() {
        return this.prompt;
    }
    /**
     * A time-based signature that can be used to accept an agreement or remove a previously accepted agreement from the list that Marketplace checks before a deployment.
     * 
     */
    @Export(name="signature", type=String.class, parameters={})
    private Output<String> signature;

    /**
     * @return A time-based signature that can be used to accept an agreement or remove a previously accepted agreement from the list that Marketplace checks before a deployment.
     * 
     */
    public Output<String> signature() {
        return this.signature;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListingPackageAgreement(String name) {
        this(name, ListingPackageAgreementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListingPackageAgreement(String name, ListingPackageAgreementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListingPackageAgreement(String name, ListingPackageAgreementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Marketplace/listingPackageAgreement:ListingPackageAgreement", name, args == null ? ListingPackageAgreementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ListingPackageAgreement(String name, Output<String> id, @Nullable ListingPackageAgreementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Marketplace/listingPackageAgreement:ListingPackageAgreement", name, state, makeResourceOptions(options, id));
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
    public static ListingPackageAgreement get(String name, Output<String> id, @Nullable ListingPackageAgreementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListingPackageAgreement(name, id, state, options);
    }
}

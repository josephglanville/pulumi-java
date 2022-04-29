// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OperationsInsightsWarehouseDownloadWarehouseWalletArgs extends com.pulumi.resources.ResourceArgs {

    public static final OperationsInsightsWarehouseDownloadWarehouseWalletArgs Empty = new OperationsInsightsWarehouseDownloadWarehouseWalletArgs();

    /**
     * Unique Operations Insights Warehouse identifier
     * 
     */
    @Import(name="operationsInsightsWarehouseId", required=true)
    private Output<String> operationsInsightsWarehouseId;

    /**
     * @return Unique Operations Insights Warehouse identifier
     * 
     */
    public Output<String> operationsInsightsWarehouseId() {
        return this.operationsInsightsWarehouseId;
    }

    /**
     * User provided ADW wallet password for the Operations Insights Warehouse.
     * 
     */
    @Import(name="operationsInsightsWarehouseWalletPassword", required=true)
    private Output<String> operationsInsightsWarehouseWalletPassword;

    /**
     * @return User provided ADW wallet password for the Operations Insights Warehouse.
     * 
     */
    public Output<String> operationsInsightsWarehouseWalletPassword() {
        return this.operationsInsightsWarehouseWalletPassword;
    }

    private OperationsInsightsWarehouseDownloadWarehouseWalletArgs() {}

    private OperationsInsightsWarehouseDownloadWarehouseWalletArgs(OperationsInsightsWarehouseDownloadWarehouseWalletArgs $) {
        this.operationsInsightsWarehouseId = $.operationsInsightsWarehouseId;
        this.operationsInsightsWarehouseWalletPassword = $.operationsInsightsWarehouseWalletPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OperationsInsightsWarehouseDownloadWarehouseWalletArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OperationsInsightsWarehouseDownloadWarehouseWalletArgs $;

        public Builder() {
            $ = new OperationsInsightsWarehouseDownloadWarehouseWalletArgs();
        }

        public Builder(OperationsInsightsWarehouseDownloadWarehouseWalletArgs defaults) {
            $ = new OperationsInsightsWarehouseDownloadWarehouseWalletArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operationsInsightsWarehouseId Unique Operations Insights Warehouse identifier
         * 
         * @return builder
         * 
         */
        public Builder operationsInsightsWarehouseId(Output<String> operationsInsightsWarehouseId) {
            $.operationsInsightsWarehouseId = operationsInsightsWarehouseId;
            return this;
        }

        /**
         * @param operationsInsightsWarehouseId Unique Operations Insights Warehouse identifier
         * 
         * @return builder
         * 
         */
        public Builder operationsInsightsWarehouseId(String operationsInsightsWarehouseId) {
            return operationsInsightsWarehouseId(Output.of(operationsInsightsWarehouseId));
        }

        /**
         * @param operationsInsightsWarehouseWalletPassword User provided ADW wallet password for the Operations Insights Warehouse.
         * 
         * @return builder
         * 
         */
        public Builder operationsInsightsWarehouseWalletPassword(Output<String> operationsInsightsWarehouseWalletPassword) {
            $.operationsInsightsWarehouseWalletPassword = operationsInsightsWarehouseWalletPassword;
            return this;
        }

        /**
         * @param operationsInsightsWarehouseWalletPassword User provided ADW wallet password for the Operations Insights Warehouse.
         * 
         * @return builder
         * 
         */
        public Builder operationsInsightsWarehouseWalletPassword(String operationsInsightsWarehouseWalletPassword) {
            return operationsInsightsWarehouseWalletPassword(Output.of(operationsInsightsWarehouseWalletPassword));
        }

        public OperationsInsightsWarehouseDownloadWarehouseWalletArgs build() {
            $.operationsInsightsWarehouseId = Objects.requireNonNull($.operationsInsightsWarehouseId, "expected parameter 'operationsInsightsWarehouseId' to be non-null");
            $.operationsInsightsWarehouseWalletPassword = Objects.requireNonNull($.operationsInsightsWarehouseWalletPassword, "expected parameter 'operationsInsightsWarehouseWalletPassword' to be non-null");
            return $;
        }
    }

}

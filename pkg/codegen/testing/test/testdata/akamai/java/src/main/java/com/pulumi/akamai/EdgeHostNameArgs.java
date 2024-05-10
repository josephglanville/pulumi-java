// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeHostNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeHostNameArgs Empty = new EdgeHostNameArgs();

    @Import(name="certificate")
    private @Nullable Output<Integer> certificate;

    public Optional<Output<Integer>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    @Import(name="contractId", required=true)
    private Output<String> contractId;

    public Output<String> contractId() {
        return this.contractId;
    }

    @Import(name="edgeHostname", required=true)
    private Output<String> edgeHostname;

    public Output<String> edgeHostname() {
        return this.edgeHostname;
    }

    @Import(name="groupId", required=true)
    private Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId;
    }

    @Import(name="ipBehavior", required=true)
    private Output<String> ipBehavior;

    public Output<String> ipBehavior() {
        return this.ipBehavior;
    }

    @Import(name="productId")
    private @Nullable Output<String> productId;

    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * Email address that should receive updates on the IP behavior update request. Required for update operation.
     * 
     */
    @Import(name="statusUpdateEmails")
    private @Nullable Output<List<String>> statusUpdateEmails;

    /**
     * @return Email address that should receive updates on the IP behavior update request. Required for update operation.
     * 
     */
    public Optional<Output<List<String>>> statusUpdateEmails() {
        return Optional.ofNullable(this.statusUpdateEmails);
    }

    /**
     * A JSON encoded list of use cases
     * 
     */
    @Import(name="useCases")
    private @Nullable Output<String> useCases;

    /**
     * @return A JSON encoded list of use cases
     * 
     */
    public Optional<Output<String>> useCases() {
        return Optional.ofNullable(this.useCases);
    }

    private EdgeHostNameArgs() {}

    private EdgeHostNameArgs(EdgeHostNameArgs $) {
        this.certificate = $.certificate;
        this.contractId = $.contractId;
        this.edgeHostname = $.edgeHostname;
        this.groupId = $.groupId;
        this.ipBehavior = $.ipBehavior;
        this.productId = $.productId;
        this.statusUpdateEmails = $.statusUpdateEmails;
        this.useCases = $.useCases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeHostNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeHostNameArgs $;

        public Builder() {
            $ = new EdgeHostNameArgs();
        }

        public Builder(EdgeHostNameArgs defaults) {
            $ = new EdgeHostNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(@Nullable Output<Integer> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(Integer certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder contractId(Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        public Builder edgeHostname(Output<String> edgeHostname) {
            $.edgeHostname = edgeHostname;
            return this;
        }

        public Builder edgeHostname(String edgeHostname) {
            return edgeHostname(Output.of(edgeHostname));
        }

        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder ipBehavior(Output<String> ipBehavior) {
            $.ipBehavior = ipBehavior;
            return this;
        }

        public Builder ipBehavior(String ipBehavior) {
            return ipBehavior(Output.of(ipBehavior));
        }

        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param statusUpdateEmails Email address that should receive updates on the IP behavior update request. Required for update operation.
         * 
         * @return builder
         * 
         */
        public Builder statusUpdateEmails(@Nullable Output<List<String>> statusUpdateEmails) {
            $.statusUpdateEmails = statusUpdateEmails;
            return this;
        }

        /**
         * @param statusUpdateEmails Email address that should receive updates on the IP behavior update request. Required for update operation.
         * 
         * @return builder
         * 
         */
        public Builder statusUpdateEmails(List<String> statusUpdateEmails) {
            return statusUpdateEmails(Output.of(statusUpdateEmails));
        }

        /**
         * @param statusUpdateEmails Email address that should receive updates on the IP behavior update request. Required for update operation.
         * 
         * @return builder
         * 
         */
        public Builder statusUpdateEmails(String... statusUpdateEmails) {
            return statusUpdateEmails(List.of(statusUpdateEmails));
        }

        /**
         * @param useCases A JSON encoded list of use cases
         * 
         * @return builder
         * 
         */
        public Builder useCases(@Nullable Output<String> useCases) {
            $.useCases = useCases;
            return this;
        }

        /**
         * @param useCases A JSON encoded list of use cases
         * 
         * @return builder
         * 
         */
        public Builder useCases(String useCases) {
            return useCases(Output.of(useCases));
        }

        public EdgeHostNameArgs build() {
            if ($.contractId == null) {
                throw new MissingRequiredPropertyException("EdgeHostNameArgs", "contractId");
            }
            if ($.edgeHostname == null) {
                throw new MissingRequiredPropertyException("EdgeHostNameArgs", "edgeHostname");
            }
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("EdgeHostNameArgs", "groupId");
            }
            if ($.ipBehavior == null) {
                throw new MissingRequiredPropertyException("EdgeHostNameArgs", "ipBehavior");
            }
            return $;
        }
    }

}

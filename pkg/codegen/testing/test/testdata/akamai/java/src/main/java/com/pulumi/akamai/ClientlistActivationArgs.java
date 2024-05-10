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


public final class ClientlistActivationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientlistActivationArgs Empty = new ClientlistActivationArgs();

    /**
     * A brief description for the activation.
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return A brief description for the activation.
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * The client list unique identifier.
     * 
     */
    @Import(name="listId", required=true)
    private Output<String> listId;

    /**
     * @return The client list unique identifier.
     * 
     */
    public Output<String> listId() {
        return this.listId;
    }

    /**
     * The network environment where you activate your client list: either STAGING or PRODUCTION.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The network environment where you activate your client list: either STAGING or PRODUCTION.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * Users to notify via email.
     * 
     */
    @Import(name="notificationRecipients")
    private @Nullable Output<List<String>> notificationRecipients;

    /**
     * @return Users to notify via email.
     * 
     */
    public Optional<Output<List<String>>> notificationRecipients() {
        return Optional.ofNullable(this.notificationRecipients);
    }

    /**
     * Identifies the Siebel ticket, if the activation is linked to one.
     * 
     */
    @Import(name="siebelTicketId")
    private @Nullable Output<String> siebelTicketId;

    /**
     * @return Identifies the Siebel ticket, if the activation is linked to one.
     * 
     */
    public Optional<Output<String>> siebelTicketId() {
        return Optional.ofNullable(this.siebelTicketId);
    }

    /**
     * The client list version.
     * 
     */
    @Import(name="version", required=true)
    private Output<Integer> version;

    /**
     * @return The client list version.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    private ClientlistActivationArgs() {}

    private ClientlistActivationArgs(ClientlistActivationArgs $) {
        this.comments = $.comments;
        this.listId = $.listId;
        this.network = $.network;
        this.notificationRecipients = $.notificationRecipients;
        this.siebelTicketId = $.siebelTicketId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientlistActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientlistActivationArgs $;

        public Builder() {
            $ = new ClientlistActivationArgs();
        }

        public Builder(ClientlistActivationArgs defaults) {
            $ = new ClientlistActivationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comments A brief description for the activation.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments A brief description for the activation.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param listId The client list unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder listId(Output<String> listId) {
            $.listId = listId;
            return this;
        }

        /**
         * @param listId The client list unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder listId(String listId) {
            return listId(Output.of(listId));
        }

        /**
         * @param network The network environment where you activate your client list: either STAGING or PRODUCTION.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The network environment where you activate your client list: either STAGING or PRODUCTION.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param notificationRecipients Users to notify via email.
         * 
         * @return builder
         * 
         */
        public Builder notificationRecipients(@Nullable Output<List<String>> notificationRecipients) {
            $.notificationRecipients = notificationRecipients;
            return this;
        }

        /**
         * @param notificationRecipients Users to notify via email.
         * 
         * @return builder
         * 
         */
        public Builder notificationRecipients(List<String> notificationRecipients) {
            return notificationRecipients(Output.of(notificationRecipients));
        }

        /**
         * @param notificationRecipients Users to notify via email.
         * 
         * @return builder
         * 
         */
        public Builder notificationRecipients(String... notificationRecipients) {
            return notificationRecipients(List.of(notificationRecipients));
        }

        /**
         * @param siebelTicketId Identifies the Siebel ticket, if the activation is linked to one.
         * 
         * @return builder
         * 
         */
        public Builder siebelTicketId(@Nullable Output<String> siebelTicketId) {
            $.siebelTicketId = siebelTicketId;
            return this;
        }

        /**
         * @param siebelTicketId Identifies the Siebel ticket, if the activation is linked to one.
         * 
         * @return builder
         * 
         */
        public Builder siebelTicketId(String siebelTicketId) {
            return siebelTicketId(Output.of(siebelTicketId));
        }

        /**
         * @param version The client list version.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The client list version.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public ClientlistActivationArgs build() {
            if ($.listId == null) {
                throw new MissingRequiredPropertyException("ClientlistActivationArgs", "listId");
            }
            if ($.network == null) {
                throw new MissingRequiredPropertyException("ClientlistActivationArgs", "network");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("ClientlistActivationArgs", "version");
            }
            return $;
        }
    }

}
